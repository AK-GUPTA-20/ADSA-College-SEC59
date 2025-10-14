/*
496. Next Greater Element I    (https://leetcode.com/problems/next-greater-element-i/description/)
Example 1:
Input: nums1 = [4,1,2], nums2 = [1,3,4,2]
Output: [-1,3,-1]

*/


class Solution {

    public int greaterElement(int[] arr, int num) {
        if(arr[arr.length-1] == num) return -1;

        // Find index of num in arr
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                index = i;
                break;
            }
        }

      
        for (int i = index + 1; i < arr.length; i++) {
            if (arr[i] > num) {
                return arr[i];
            }
        }

        

        return -1;  
    }

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        for (int i = 0; i < nums1.length; i++) {
            nums1[i] = greaterElement(nums2, nums1[i]);
        }

        return nums1;
    }
}
