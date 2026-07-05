class Solution {
    public int characterReplacement(String s, int k) {
         Map<Character, Integer> frequencyMap = new HashMap<>();

        int left =0;
        int maxFrequency =0;
        int result=0;
        for(int right =0; right<s.length();right++){
            frequencyMap.put(s.charAt(right), frequencyMap.getOrDefault(s.charAt(right),0)+1);
            maxFrequency = Math.max(frequencyMap.get(s.charAt(right)), maxFrequency);

            int replacementsNeeded = right-left+1-maxFrequency;
            if(replacementsNeeded > k){
                frequencyMap.put(s.charAt(left), frequencyMap.get(s.charAt(left))-1);
                left++;
            }

            result = Math.max(result, right-left+1);
        }  
        return result;      
    }

}
