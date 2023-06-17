-------------------------------------------------- Linked List (Easy) -----------------------------------------------
  
Ques Link - https://practice.geeksforgeeks.org/problems/delete-without-head-pointer/1?page=1&difficulty[]=0&category[]=Linked%20List&sortBy=submissions

------------------------------------------------- Solution ------------------------------------------------
  
class Solution
{
    //Function to find the data of nth node from the end of a linked list.
    int getNthFromLast(Node head, int n)
    {
    	int count=0;
    	Node t = head;
    	while(t != null){
    	    t=t.next;
    	    count++;
    	}
    	if(n > count)
    	    return -1;
    	    
    	count=count-n;
    	t=head;
    	
    	while(count > 0){
    	    t=t.next;
    	    count--;
    	}
    	
    	return t.data;
    }
}
