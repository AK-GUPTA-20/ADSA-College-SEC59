/*
81. Search in Rotated Sorted Array II           (https://leetcode.com/problems/search-in-rotated-sorted-array-ii/description/)
Input: nums = [2,5,6,0,0,1,2], target = 0
Output: true
*/


class Solution {
    public boolean search(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        while(left<=right){
            if(nums[left]==target)
                return true;
            else if(nums[right]==target)
                return true;
            else{
                left++;
                right--;
            }        
        }
        return false;
    }
}
