/*
162. Find Peak Element      (https://leetcode.com/problems/find-peak-element/description/)
Input: nums = [1,2,3,1]
Output: 2
*/

class Solution {
    public int findPeakElement(int[] nums) {
        int left = 0 ;
        int right = nums.length-1;
        while(left<right){
            int mid = left + (right-left)/2;
            if(nums[mid]<nums[mid+1]) {
                left = mid+1;
            }else{
                right=mid;
            }
        }
        return left;
    }
}
