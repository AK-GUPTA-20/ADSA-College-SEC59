/*
Postfix to Infix Conversion  (http://geeksforgeeks.org/problems/postfix-to-infix-conversion/1)
Input:  ab*c+ 
Output:  ((a*b)+c)

*/

// User function Template for Java

class Solution {
    static String postToInfix(String exp) {
        Stack<String> st = new Stack<>();
        
        for(int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);
            
            if(Character.isLetterOrDigit(ch)) {
                st.push(ch + "");
            } 
            else {
                String op2 = st.pop(); // second operand
                String op1 = st.pop(); // first operand
                
                String s = "(" + op1 + ch + op2 + ")";
                st.push(s);
            }
        }
        
        return st.peek();
    }
}


