/*
34. Find First and Last Position of Element in Sorted Array         (https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/)
Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]
*/

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int [] ans = {-1,-1};

        int left = binarySearch(nums, target, true);
        int right = binarySearch(nums, target, false);
        ans[0] = left;
        ans[1] = right;
        return ans;   
    }

    private int binarySearch(int[] nums , int target , boolean FindStartIndex ){
        int start = 0;
        int end = nums.length-1;
        int ans = -1;
        while(start<=end){
            int mid = start + (end - start)/2;

            if (target > nums[mid]){
                start = mid+1;
            }
            else if(target < nums[mid]){
                end = mid-1;
            }
            else{
                ans = mid;
                if(FindStartIndex){
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }
            }
        }
        return ans;
    }
    }
