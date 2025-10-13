/*
Prefix to Infix Conversion  (https://www.geeksforgeeks.org/problems/prefix-to-infix-conversion/1)
Input:   *-A/BC-/AKL
Output:   ((A-(B/C))*((A/K)-L))

  */


class Solution {
    static String preToInfix(String s) {
        // code here
        Stack<String> st = new Stack<>();
        for(int i=s.length()-1 ; i>=0 ; i--){
            char ch = s.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                st.push(ch+"");
            }else{
                String exp = '(' + st.pop() + ch+ st.pop() + ')';
                st.push(exp);
            }
            
        }
        return st.peek();
    }
}
