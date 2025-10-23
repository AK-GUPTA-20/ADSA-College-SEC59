/*
287. Find the Duplicate Number      ()
Input: nums = [1,3,4,2,2]
Output: 2
*/

class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int x : nums){
            if(set.contains(x)){
                return x;
            }
            set.add(x);
        }
        return 0;
    }
}
