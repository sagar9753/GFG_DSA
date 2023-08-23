Ques Link https://practice.geeksforgeeks.org/problems/insert-an-element-at-the-bottom-of-a-stack/1?page=2&difficulty[]=0&category[]=Stack&sortBy=submissions

------------------------------------------------------ Solution -----------------------------------------------------------------

class Solution {
    public Stack<Integer> insertAtBottom(Stack<Integer> st, int X) {
        insert(st,X);
        return st;
    }
    public void insert(Stack<Integer> st, int X){
        if(st.empty()){
            st.push(X);
            return;
        }
        int ele = st.peek();
        st.pop();
        insert(st,X);
        st.push(ele);
    }
}
