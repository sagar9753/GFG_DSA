Ques Link - https://practice.geeksforgeeks.org/problems/max-sum-without-adjacents2430/1?page=1&difficulty[]=0&category[]=Dynamic%20Programming&sortBy=submissions

----------------------------------------------------------- Solution --------------------------------------------------------------------

class Solution {
    int findMaxSum(int arr[], int n) {
        int prev1 = 0;
        int prev2 = 0;
        
        for(int i = 0 ; i < n ; i++){
            int dp = Math.max(arr[i]+prev1,prev2);
            prev1 = prev2;
            prev2 = dp;
        }
        return prev2;
        
    }
    
}
