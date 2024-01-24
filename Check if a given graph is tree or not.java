Ques Link - https://www.geeksforgeeks.org/problems/is-it-a-tree/1

------------------------------------------------- Solution ------------------------------------------------------

class Solution {
    public boolean isTree(int n, int m, ArrayList<ArrayList<Integer>> edges) 
    {
        if(m != n-1) return false;
        // code here
        int[] parent = new int[n];
        Arrays.fill(parent,-1);
        
        for(ArrayList<Integer> adj : edges){
            int u = findParent(adj.get(0),parent);
            int v = findParent(adj.get(1),parent);
            
            if(u == v) return false;
            
            parent[u] = v;
        }
        
    
        return true;
    }
    private static int findParent(int i,int[] parent){
        while(parent[i] != -1){
            i = parent[i];
        }
        return i;
    }
}
