/*
540. Single Element in a Sorted Array        (https://leetcode.com/problems/single-element-in-a-sorted-array/)
Input: nums = [1,1,2,3,3,4,4,8,8]
Output: 2
*/

class Solution {
    public int singleNonDuplicate(int[] nums) {
        if (nums.length == 1) return nums[0];
        int i = 0;
        while (i < nums.length - 1) {
            if (nums[i] != nums[i + 1]) return nums[i];
            i += 2;
        }
        return nums[nums.length - 1];
    }
}
