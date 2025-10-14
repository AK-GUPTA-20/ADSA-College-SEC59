/*
1. Two Sum   (https://leetcode.com/problems/two-sum/description/)

Input: nums = [2,7,11,15], target = 9
Output: [0,1]

*/

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer , Integer> mp = new HashMap<>();
        
        for(int i=0 ; i<nums.length ; i++){
            int number = target-nums[i];
            if (mp.containsKey(number)) {
                return new int[] {mp.get(number), i};
            }
            mp.put(nums[i], i);  
        }
        return new int[] {};   
    }
}
