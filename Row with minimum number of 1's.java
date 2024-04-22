Ques Link - https://www.geeksforgeeks.org/problems/row-with-minimum-number-of-1s5430/1

---------------------------------- Solution ---------------------------------------------------

class Solution {
    int minRow(int n, int m, int a[][]) {
        // code here
        int count = m;
        int res = 0;
        for(int i=0; i<n; i++){
            int c = 0;
            for(int b : a[i]){
                c += b;
            }
            if(c < count){
                count = c;
                res = i;
            }
        }
        return res+1;
    }
};
