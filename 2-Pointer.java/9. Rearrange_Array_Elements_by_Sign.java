/*
2149. Rearrange Array Elements by Sign    (https://leetcode.com/problems/rearrange-array-elements-by-sign/description/)
Input: nums = [3,1,-2,-5,2,-4]
Output: [3,-2,1,-5,2,-4]
*/


class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] result = new int[nums.length];
        int even = 0, odd = 1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                result[even] = nums[i];
                even += 2;
            } else {
                result[odd] = nums[i];
                odd += 2;
            }
        } 
        return result;
    }
}
