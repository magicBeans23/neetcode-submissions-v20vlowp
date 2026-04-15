class Solution {
    public int findMin(int[] nums) {
        int i=0;
        while(i<nums.length-1 && nums[i+1]>nums[i++]);

        if(i==nums.length-1 && nums[0]<nums[i])
            return nums[0];
        else
            return nums[i]; 
    }
}
