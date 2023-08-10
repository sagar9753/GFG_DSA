Ques Link - https://practice.geeksforgeeks.org/problems/minimum-distance-between-two-numbers/1?page=2&difficulty[]=0&category[]=Arrays&category[]=Strings&category[]=Linked%20List&sortBy=submissions

------------------------------------------------- Solution ---------------------------------------------------------------

class Solution {
    int minDist(int a[], int n, int x, int y) {
    
        int x1 = -1;
        int y1 = -1;
        int min = Integer.MAX_VALUE;
        
        for(int i = 0 ; i < n ; i++){
            if(a[i] == x)
                x1 = i;
            if(a[i] == y)
                y1 = i;
                
            if(x1 != -1 && y1 != -1 && Math.abs(x1-y1) > 0){
                min = Math.min(min, Math.abs(x1 - y1));
            }
        }
        if(min == Integer.MAX_VALUE){
            return -1 ;
        }
        return min;
    }
}
