/*
Generate Binary Numbers        (https://www.geeksforgeeks.org/problems/generate-binary-numbers-1587115620/1)
Input: n = 4
Output: ["1", "10", "11", "100"]
*/

class Solution {
    public ArrayList<String> generateBinary(int n) {
        // code here
        ArrayList<String> result = new ArrayList<>();
        Queue<String> q = new LinkedList<>();

        q.add("1");

        for (int i = 0; i < n; i++) {
            String curr = q.remove();
            result.add(curr);

            q.add(curr + "0");
            q.add(curr + "1");
        }

        return result;
        
    }
}
