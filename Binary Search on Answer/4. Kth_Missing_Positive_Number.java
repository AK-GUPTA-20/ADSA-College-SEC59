/*
1539. Kth Missing Positive Number  ()
Input: arr = [2,3,4,7,11], k = 5
Output: 9
*/
class Solution {
    public int findKthPositive(int[] arr, int k) {
        int n = arr.length;
        int idx = 0;
        int elem = arr[n - 1] + k;
        int count = 0;

        for (int i = 1; i <= elem; i++) {
            if (idx < n && arr[idx] == i) {
                idx++;
            } else {
                count++;
                if (count == k) {
                    return i;
                }
            }
        }
        return -1;

    }
}
