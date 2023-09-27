Ques Link - https://practice.geeksforgeeks.org/problems/index-of-an-extra-element/1?page=2&difficulty[]=0&status[]=unsolved&category[]=Arrays&sortBy=submissions

----------------------------------------- Solution ----------------------------------------------

class Solution {
    public int findExtra(int a[], int b[], int n) {
        // add code here.
        int l = 0; 
        int r = n-1;
        
        int mid;
        
        while(l < r){
            mid = (l + r)/2;
            
            if(a[mid] == b[mid])
                l = mid + 1;
            else
                r = mid;
        }
        return l;
    }
}
