/*
Reverse first K of a Queue     (https://www.geeksforgeeks.org/problems/reverse-first-k-elements-of-queue/1)
Input: q = [1, 2, 3, 4, 5], k = 3
Output: [3, 2, 1, 4, 5]
*/

class Solution {
    public Queue<Integer> reverseFirstK(Queue<Integer> q, int k) {
        // code here
         if (q.size() < k) return q;
        Stack<Integer> st = new Stack<>();
        for(int i=0 ; i<k ; i++){
            st.push(q.remove());
        }
        
        while(!st.isEmpty()){
            q.add(st.pop());
        }
        
        for(int i=0 ; i<q.size()-k ; i++){
            q.add(q.remove());
        }
        
        return q;
    }
}
