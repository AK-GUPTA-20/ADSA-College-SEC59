/*
Aggressive Cows        (https://www.geeksforgeeks.org/problems/aggressive-cows/1)
Input: stalls[] = [1, 2, 4, 8, 9], k = 3
Output: 3
*/


class Solution {
    boolean isPossible(int[] stalls , int dist , int cow){
        int count =1;
        int lastCow = stalls[0];
        for(int i=1 ; i<stalls.length ; i++){
            if(stalls[i] - lastCow >= dist){
                count++;
                lastCow = stalls[i];
            }
            if(count == cow) return true;
            
        }
        return false;
    }
    
    public int aggressiveCows(int[] stalls, int k) {
        
        Arrays.sort(stalls);
        
        int low =1;
        int n=stalls.length;
        int high = stalls[n-1] - stalls[0];
        int ans = 0;
        
        while(low<=high){
            int mid = low + (high-low)/2;
            
            if(isPossible(stalls , mid , k)){
                ans = mid;
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return ans;
    }
}
