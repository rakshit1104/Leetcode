class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<Character>();
        for(char ch : s.toCharArray()){
            if(ch=='(' || ch=='{' || ch=='['){
                st.push(ch);
            } else{
                if(st.isEmpty()) return false;
                char cha = st.pop();
                if((ch==')' && cha=='(') || (ch=='}' && cha=='{') || (ch==']' && cha=='[')){
                    continue;
                } else{
                    return false;
                }
            }
        }
        return st.isEmpty();
    }
}