class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0)
            return 0;
        Set<Integer> set = new HashSet<>();
        for(int num: nums){
            set.add(num);
        }
        int largestSequence =1;
        for(int num: set){
           if(set.contains(num-1)){
               int startOfSequence = num-1;
               int streak =1;
               while(set.contains(++startOfSequence)){
                   streak++;
               }
               if(streak>largestSequence){
                   largestSequence=streak;
               }
           }
        }
        return largestSequence;
    }
}
