Ques Link - https://www.geeksforgeeks.org/problems/in-first-but-second5423/1

------------------------------------------- Solution ------------------------------------

class Solution
{
    ArrayList<Integer> findMissing(int a[], int b[], int n, int m)
    {
      Set <Integer> bset=new HashSet<>();
      for(int num:b)
      {
          bset.add(num);
      }
        
      ArrayList<Integer> result=new ArrayList<>();
     for(int num:a)
     {
         if(!bset.contains(num))
         {
             result.add(num);
         }
     }
     return result;
    }
}
