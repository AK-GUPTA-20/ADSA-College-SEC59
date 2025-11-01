/*
The Painter's Partition Problem-II    (https://www.geeksforgeeks.org/problems/the-painters-partition-problem1535/1)
Input: arr[] = [5, 10, 30, 20, 15], k = 3
Output: 35
*/

class Solution {
    public int minTime(int[] arr, int k) {
        // code here
        int low = max(arr);
        int high = sum(arr);
        int res = 0;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(isPossible(arr,k,mid)){
                res = mid;
                high = mid-1;
            }else{
                low = mid+1;
            }
        }
        return res;
    }
    
    int sum(int[] nums) {
        int s = 0;
        for (int num : nums) {
            s += num;
        }
        return s;
    }

    int max(int[] nums) {
        int max = 0;
        for (int num : nums) {
            if (num > max) max = num;
        }
        return max;
    }
    
    boolean isPossible(int[] arr , int k , int day ){
        int count = 1;
        int sum =0;
        
        for(int num : arr){
            if(num > day) return false;
            if(num+sum > day){
                count++;
                sum = 0;
            }
            sum += num;
        }
        return count <= k;
    }

}
