Ques Link - https://practice.geeksforgeeks.org/problems/pairwise-swap-elements-of-a-linked-list-by-swapping-data/1

------------------------------------------------ Solution ----------------------------------------------------------


class Solution {
    public Node pairwiseSwap(Node head)
    {
        if(head == null||head.next ==null) return head;
        Node first = head;
        Node second = head.next;
        first.next = second.next;
        second.next = first;
        first.next = pairwiseSwap(first.next);
        return second;
        
    }
}
