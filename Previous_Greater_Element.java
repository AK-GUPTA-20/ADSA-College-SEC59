// Previous Greater Element
// Input: arr[] = [10, 4, 2, 20, 40, 12, 30]
// Output: [-1, 10, 4, -1, -1, 40, 40]

class Solution {
    static ArrayList<Integer> preGreaterEle(int[] arr) {
        // code here
        
        int n=arr.length;
        
        Stack<Integer> st = new Stack<>();
        ArrayList<Integer> res = new ArrayList<>();
        
        for(int i=0 ; i<n  ; i++){
            while(!st.isEmpty() && st.peek()<= arr[i]){
                st.pop();
            }
            
            if(st.isEmpty()){
                res.add(-1);
            }else{
                res.add(st.peek());
            }
            st.push(arr[i]);
        }
        
        return res;
    }
}
