Ques Link https://www.geeksforgeeks.org/problems/search-pattern-rabin-karp-algorithm--141631/1

--------------------------------------- Solution ---------------------------------------------

class Solution
{
    
    ArrayList<Integer> search(String ptrn, String text)
    {
        ArrayList<Integer> ans = new ArrayList<>();
        int tlen = ptrn.length();
        for(int i = 0 ; i <= text.length()-tlen ; i++){
            if(ptrn.equals(text.substring(i,i+tlen)))
                ans.add(i+1);
        }
        return ans;
    }
}
