Ques Link - https://www.geeksforgeeks.org/problems/binary-tree-to-cdll/1

----------------------------------------- Solution ------------------------------------------------

class Solution
{ 
    Node bTreeToClist(Node root){
        Queue<Integer> q=new LinkedList<>();
        inorder(q,root);
        Node head=new Node(q.peek());
        q.remove();
        Node p=head;
        p.left=null;

        while(!q.isEmpty()){
            int n=q.peek();
            q.remove();
            Node newNode=new Node(n);
            p.right=newNode;
            newNode.left=p;
            p=newNode;
        }
        head.left=p;
        p.right=head;
        return head;

    }

    public static void inorder(Queue<Integer> q, Node root){
        if(root==null)
            return;

        inorder(q,root.left);
        q.add(root.data);
        inorder(q,root.right);
    }

}
