/*
First negative in every window of size k   (https://www.geeksforgeeks.org/problems/first-negative-integer-in-every-window-of-size-k3345/1)
Input: arr[] = [-8, 2, 3, -6, 10] , k = 2
Output: [-8, 0, -6, -6]
*/

class Solution {
    static List<Integer> firstNegInt(int arr[], int k) {
        Queue<Integer> q = new LinkedList<>();
        List<Integer> lst = new ArrayList<>();
        int n = arr.length;

        for (int i = 0; i < k; i++) {
            if (arr[i] < 0) q.add(i); 
        }

        for (int i = k; i <= n; i++) {
            if (!q.isEmpty()) {
                lst.add(arr[q.peek()]);
            } else {
                lst.add(0);
            }

            while (!q.isEmpty() && q.peek() <= i - k) {
                q.poll();
            }

            if (i < n && arr[i] < 0) {
                q.add(i);
            }
        }

        return lst;
    }
}
