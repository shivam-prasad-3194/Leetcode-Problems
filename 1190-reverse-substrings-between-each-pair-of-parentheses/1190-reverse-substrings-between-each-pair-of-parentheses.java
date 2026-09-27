class Solution {
    // Time complexity: O(N^2) 
    // Space complexity: O(N)
    public String reverseParentheses(String s) {
        Stack<StringBuilder> st = new Stack<>(); // stack to store strings before '('
        StringBuilder curr = new StringBuilder();       // current working string

        for(char ch: s.toCharArray()){
            if(ch == '('){
                st.push(curr);  // save current string before '('
                curr = new StringBuilder();   // reset the current string 
            }else if(ch == ')'){
                // reverse the current substring inside the parenthesis
                curr.reverse();
                // Combine previous string + reversed substring
                curr.insert(0, st.pop());
            }else{
                curr.append(ch); // build current substring
            }
        }
        return curr.toString();  // final reversed string
    }
}