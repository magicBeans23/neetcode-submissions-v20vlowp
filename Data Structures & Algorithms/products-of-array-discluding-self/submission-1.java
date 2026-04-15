class Solution {
    public int[] productExceptSelf(int[] nums) {
       int[] prefix = new int[nums.length];
       int prefixProduct = 1;
       for(int i=0;i<nums.length;i++){
           prefix[i]= prefixProduct;
           prefixProduct = prefixProduct*nums[i];
       }
        System.out.println(Arrays.toString(prefix));

       int[] suffix = new int[nums.length];
       int suffixProduct = 1;
        for(int i= nums.length-1;i>=0;i--){
            suffix[i]= suffixProduct;
            suffixProduct = suffixProduct*nums[i];

        }
        System.out.println(Arrays.toString(suffix));

        for(int i=0;i<nums.length;i++){
            prefix[i] = prefix[i]*suffix[i];
        }

        return prefix;

    }
}  
