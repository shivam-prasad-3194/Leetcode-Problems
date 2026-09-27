class Solution {
    // Time complexity: O(N^2) because curr += ch creates a new String and copies the existing curr each time, resulting in 1 + 2 + 3 + ... + N = O(N²).
    // Space complexity: O(N)
    public String reverseParentheses(String s) {
        Stack<String> st = new Stack<>(); // stack to store strings before '('
        String curr = "";       // current working string

        //
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '('){
                st.push(curr);  // save current string before '('
                curr = "";   // reset the current string 
            }else if(ch == ')'){
                // reverse the current substring inside the parenthesis
                String revCurr = new StringBuilder(curr).reverse().toString();
                // Combine previous string + reversed substring
                curr = st.pop() + revCurr;
            }else{
                curr += ch; // build current substring
            }
        }
        return curr;  // final reversed string
    }
}