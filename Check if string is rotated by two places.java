Ques Link - https://www.geeksforgeeks.org/problems/check-if-string-is-rotated-by-two-places-1587115620/1

------------------------------------------- Solution ----------------------------------------

class Solution
{
     public static boolean isRotated(String str1, String str2)
    {
        // Your code here
        int n=str1.length();
        int n2=str2.length();
        if(n!=n2)
            return false;
        String str3=str1+str1;
        if(str3.indexOf(str2)==2||str3.indexOf(str2)==n-2)
            return true;
        return false;
    }
    
}
