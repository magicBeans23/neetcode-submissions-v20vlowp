class Solution {
    public int trap(int[] height) {
          int[] leftMax= new int[height.length];
        int[] rightMax = new int[height.length];

        int max =0;
        for(int i=0;i<height.length;i++){
            max = Math.max(max, height[i]);
            leftMax[i] = max;
        }

        max=0;
        for(int i= height.length-1;i>=0;i--){
            max = Math.max(max, height[i]);
            rightMax[i] = max;
        }
        int totalWater = 0;
        for(int i=0;i< height.length-1;i++){
            totalWater = totalWater + Math.min(leftMax[i], rightMax[i])-height[i];
        }
        return totalWater;
    }
}
