/*
Prefix to Postfix Conversion  (https://www.geeksforgeeks.org/problems/prefix-to-postfix-conversion/1)

Input:   *-A/BC-/AKL
Output:   ABC/-AK/L-*

*/

// User function Template for Java

class Solution {
    static String preToPost(String pre_exp) {
        // code here
        Stack<String> st = new Stack<>();
        for(int i=pre_exp.length()-1 ; i>=0 ; i--){
            char ch = pre_exp.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                st.push(ch+"");
            }else{
                String s = st.pop() + st.pop() + ch ; 
                st.push(s);
            }
        }
        return st.peek();
    }
}
