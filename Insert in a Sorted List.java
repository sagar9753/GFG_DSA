Ques Link - https://practice.geeksforgeeks.org/problems/insert-in-a-sorted-list/1

----------------------------------- Solution ----------------------------------------

class Solution {
    Node sortedInsert(Node head, int key) {
        boolean check = false;
        Node newNode = new Node(key);
        if(head==null){
            head = newNode;
            check = true;
        }
        else if(head.data > newNode.data){
            newNode.next = head;
            head = newNode;
            check = true;
        }
        else{
            Node prev = head;
            Node temp = head;
            while(temp.next!=null){
                prev = temp;
                temp = temp.next;
                if(temp.data > newNode.data){
                    prev.next = newNode;
                    newNode.next = temp;
                    check = true;
                    break;
                }
            }
                if(check==false){
                    temp.next = newNode;
                }
        }
        return head;
    }
}
