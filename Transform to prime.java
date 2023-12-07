Ques Link - https://www.geeksforgeeks.org/problems/transform-to-prime4635/1

------------------------------------------ Solution ----------------------------------------------

class Solution
{
    public int minNumber(int arr[], int N) {
        
        int sum = Arrays.stream(arr).sum();
        int ans = 0;
        for(int i=sum; ; i++) {
            if(isPrime(i)) break;
            ans++;
        }
        return ans;
    }
    
    boolean isPrime(int number) {
        for(int i=2; i*i<=number; i++) {
            if(number%i == 0) return false;
        }
        return true;
    }
}
