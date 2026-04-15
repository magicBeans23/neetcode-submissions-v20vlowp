class Solution {
     public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();

        for (String str: strs){
            char[] arr = str.toCharArray();
            Arrays.sort(arr);
            String key = new String(arr);
            if(map.containsKey(key)){
                List<String> list = new ArrayList<>(map.get(key));
                list.add(str);
                map.put(key, list);
            }else{
                map.put(key, List.of(str));
            }
        }
        return new ArrayList<>(map.values());
    }

    private boolean anagram(String s, String t){
        if(s.length()!=t.length()){
            return false;
        }

        int[] dictionary = new int[26];

        for(int i=0;i<s.length();i++){
            dictionary[s.charAt(i)-'a']++;
            dictionary[t.charAt(i)-'a']--;
        }

        for(int count: dictionary){
            if(count!=0){
                return false;
            }
        }
        return true;
    }
}

