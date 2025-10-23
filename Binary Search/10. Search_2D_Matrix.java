/*
74. Search a 2D Matrix        (https://leetcode.com/problems/search-a-2d-matrix/description/)
Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
Output: true
*/


class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;
        int i=0;
        int j=m-1;

        while(i<n && j>=0){
            if(matrix[i][j] > target)  j--;
            else if(matrix[i][j] < target) i++;
            else return true;
        }
        return false;
    }
}
