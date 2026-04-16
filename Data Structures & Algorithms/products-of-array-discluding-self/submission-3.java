class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product = 1;
        int productExceptZero=1;
        int countZeros=0;
        for(int num: nums){
            product = product * num;
            if(num!=0){
                productExceptZero= productExceptZero*num;
            }else{
                countZeros++;
            }
        }
        int[] result = new int[nums.length];

        for(int i=0;i<result.length;i++){
            if(nums[i]!=0){
                result[i] = product/nums[i];
            }else{
                if(countZeros>1){
                    result[i]=0;
                }else{
                    result[i] = productExceptZero;
                }
                
            }
            
        }
        return result;
    }
}  
