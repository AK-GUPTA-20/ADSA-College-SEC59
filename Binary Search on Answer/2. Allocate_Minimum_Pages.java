/*
Allocate Minimum Pages     (https://www.geeksforgeeks.org/problems/allocate-minimum-number-of-pages0937/1)
Input: arr[] = [12, 34, 67, 90], k = 2
Output: 113
*/

class Solution {
    
    boolean isPossible(int[] arr, int student, int pages) {
        int count = 1;       
        int totPage = 0;      
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > pages) return false; 
            
            if (totPage + arr[i] > pages) {
                
                count++;
                totPage = arr[i];
                if (count > student) return false; 
            } else {
                totPage += arr[i];
            }
        }
        return true; // allocation possible
    }
    
    // we have to maximise , range must be in max
    public int findPages(int[] arr, int k) {
        // code here
        
        if(k>arr.length) return -1;
        
        int low = Arrays.stream(arr).max().getAsInt();   //  finding max in low
        int high = Arrays.stream(arr).sum();             // finding sum for max in high
        int res = -1;
        
        while(low<=high){
            int mid = low + (high-low) /2;
            if(isPossible(arr, k , mid)){
                res = mid;
                high = mid-1;
            }
            else{
                low =  mid+1;
            }
        }
        return res;
    }
}
