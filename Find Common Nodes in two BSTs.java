Ques LInk - https://practice.geeksforgeeks.org/problems/print-common-nodes-in-bst/1

--------------------------------------------------- Solution ------------------------------------------------------------

class Solution
{
    //Function to find the nodes that are common in both BST.
	public static ArrayList<Integer> findCommon(Node root1,Node root2)
    {
        //code here
        Set<Integer> hset1 = new HashSet<>();
        Set<Integer> hset2 = new HashSet<>();
        traverse(root1, hset1);
        traverse(root2, hset2);
        
        ArrayList<Integer> ans = new ArrayList<>();
        
        for(Integer i : hset2){
            if(hset1.contains(i)) ans.add(i);
        }
        Collections.sort(ans);
        return ans;
    }
    
    static void traverse(Node root, Set<Integer> hset){
        if(root == null) return;
        hset.add(root.data);
        traverse(root.left, hset);
        traverse(root.right, hset);
    }
}
