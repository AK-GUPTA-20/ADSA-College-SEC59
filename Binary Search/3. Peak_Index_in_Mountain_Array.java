/*
852. Peak Index in a Mountain Array     (https://leetcode.com/problems/peak-index-in-a-mountain-array/)
Input: arr = [0,1,0]
Output: 1
*/

class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int left = 0;
        int right = arr.length-1;

        while(left<=right){
            int mid = left + (right-left)/2;
            if(arr[mid] > arr[mid+1]) right = mid-1;
            else left = mid+1;
        }
        return left;
    }
}
