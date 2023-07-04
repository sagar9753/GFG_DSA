-------------------------------------------------- Linked List (Easy) -----------------------------------------------
  
Ques Link - https://practice.geeksforgeeks.org/problems/delete-without-head-pointer/1?page=1&difficulty[]=0&category[]=Linked%20List&sortBy=submissions

------------------------------------------------- Solution ------------------------------------------------
  
class Solution
{
    //Function to find the data of nth node from the end of a linked list.
    int getNthFromLast(Node head, int n)
    {
    	int count=0;
    
    	Node temp = head;
    	Node dummy = new Node(-1);
    	Node t = dummy;
    	dummy.next = head;
    	
    	while(temp != null){
    	    if(count >= n-1){
    	        t=t.next;
    	    }
    	    temp=temp.next;
    	    count++;
    	}
    	return t.data;
    }
}
