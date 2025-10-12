// 42. Trapping Rain Water   (https://leetcode.com/problems/trapping-rain-water/description/)
// Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
// Output: 6


class Solution {
    public int trap(int[] height) {
        int i=0;
        int j=height.length-1;
        int leftMax = 0;
        int rightMax = 0;
        int maxWater = 0;

        while(i<j){
            if(height[i]<height[j]){
                if(height[i] > leftMax){
                    leftMax = height[i];
                }
                else{
                    maxWater += leftMax - height[i] ;
                }
                    i++;
            }
            else{
                if(height[j] > rightMax ){
                    rightMax = height[j];
                }else{
                    maxWater += rightMax - height[j] ;
                }
                j--;

            }
        }
        return maxWater;
        
    }
}
                  
