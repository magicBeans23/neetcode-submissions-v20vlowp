class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
            return false;
        int[] dictionary = new int[26];
        for(int i=0;i<s.length();i++){
            dictionary[s.charAt(i)-'a']++;
            dictionary[t.charAt(i)-'a']--;
        }
        for(int count:dictionary){
            System.out.println(count);
            if(count!=0)
                return false;
        }
        return true;
    }
}
