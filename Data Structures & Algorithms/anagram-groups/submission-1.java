class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap();

        for(String str:strs){
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String s = new String(chars);
            if(map.get(s)==null){
                map.put(s,new ArrayList(Arrays.asList(str)));
            }else{
                List<String> list = map.get(s);
                list.add(str);
            }
        }
        return new ArrayList<>(map.values());
    }
}
