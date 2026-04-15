class Solution {
    public int maxArea(int[] heights) {
         int left = 0;
        int right = heights.length - 1;
        int maxdepth = 0;
//formula = (right - left _ * max(height(left),height(right))
        while (left < right) {
            int depth = (right - left) * Math.min(heights[right] , heights[left]);

            if (depth > maxdepth) {
                maxdepth = depth;
            }
            if (heights[left] < heights[right]) {
                left++;
            } else right--;
        }
        return maxdepth;
    }
}
