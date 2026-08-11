class Solution {
    public int maxArea(int[] height) {
        int maxArea = 0;
        int left = 0;
        int right = height.length -1;
        while(left < right){
            int currHeight = Math.min(height[left],height[right]);
            int currWidth = right - left;
            int currArea = currHeight * currWidth;

            maxArea = Math.max(maxArea, currArea);
            if(height[left]< height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return maxArea;
        
    }
}