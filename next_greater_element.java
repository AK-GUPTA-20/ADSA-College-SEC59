// Next Greater Element
// Input: arr[] = [1, 3, 2, 4]
// Output: [3, 4, 4, -1]


import java.util.*;

class Solution {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        ArrayList<Integer> res = new ArrayList<>(Collections.nCopies(n, -1));
        
        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && st.peek() <= arr[i]) {
                st.pop();
            }
            
            if (!st.isEmpty()) {
                res.set(i, st.peek());
            } else {
                res.set(i, -1);
            }
            
            st.push(arr[i]);
        }
        return res;
    }
}
