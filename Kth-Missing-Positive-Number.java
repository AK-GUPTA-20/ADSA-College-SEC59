//  1539. Kth Missing Positive Number
// Given an array arr of positive integers sorted in a strictly increasing order, and an integer k
// Input: arr = [2,3,4,7,11], k = 5    ,     Output: 9
// Explanation: The missing positive integers are [1,5,6,8,9,10,12,13,...]. The 5th missing positive integer is 9.

class Solution {
    public int findKthPositive(int[] arr, int k) {
        int n = arr.length;
        int idx = 0;
        int elem = arr[n-1] + k;
        int count = 0;

        for(int i=1 ; i<= elem ; i++){
            if(idx<n && arr[idx] == i){
                idx++;
            }else{
                count++;
                if(count == k){
                    return i;
                }
            }
        }
        return -1;
        
    }
}
