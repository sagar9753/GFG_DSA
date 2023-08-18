Ques Link - https://practice.geeksforgeeks.org/problems/find-length-of-loop/1?page=1&difficulty[]=0&status[]=unsolved&category[]=Linked%20List&sortBy=submissions

------------------------------------------------- Solution ----------------------------------------------------------

class Solution
{
    static int countNodesinLoop(Node head)
    {
        int ans = 0;
        boolean check = false;
        Node slow = head;
        Node fast = head;
        
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                check = true;
                break;
            }
        }
        if(check == false)
            return 0;
        
        while(ans == 0 || slow != fast){
            slow = slow.next;
            fast = fast.next.next;
            ans++;
        }
        return ans;
        
    }
}
