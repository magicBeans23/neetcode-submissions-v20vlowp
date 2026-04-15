class Solution {
    public int[] twoSum(int[] nums, int target) {
         Map<Integer, Integer> map= new HashMap<>();
        int[] result = new int[2];
        for(int index =0; index< nums.length; index++){
            if(map.containsKey(target-nums[index])){
                result[0]=map.get(target-nums[index]);
                result[1]=index;
                return result;
            }else{
                map.put(nums[index], index);
            }
        }
        return result;
    }
}
