class Solution {
    public int lengthOfLongestSubstring(String s) {
          int longestSubstring = 0;
        int left = 0;
        Set<Character> set = new HashSet<>();
        for (int right = 0; right < s.length(); right++) {
            char c = s.charAt(right);

            //to move the left counter to the first occurrence of the character which was found repeating
            while(set.contains(c)){
                set.remove(s.charAt(left++));
            }

            set.add(c);
            longestSubstring = Math.max(longestSubstring, right-left+1);
        }
        return longestSubstring;  
    }
}
