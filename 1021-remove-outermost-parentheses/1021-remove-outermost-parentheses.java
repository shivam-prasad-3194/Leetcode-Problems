class Solution {
    // Time complexity: O(N)
    // Space complexity: O(N)
    public String removeOuterParentheses(String s) {
        // stack is used to keep track of opening parentheses '('
        Stack<Character> st = new Stack<>();
        String ans = "";  // it stores the ans

        // traverse the every character of the string 
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);

            // If stack is NOT empty, it means we are
            // inside a primitive parentheses group
            if(!st.isEmpty()){
                if(ch == '(') st.push(ch);
                else if(ch == ')') st.pop();

                // If stack is still NOT empty after push/pop,
                // current character is NOT an outermost parenthesis.
        
                // Therefore, add it to answer.
                if(!st.isEmpty()){
                    ans += ch;
                }
            }else{
                // Stack is empty -> we are currently outside
                // any primitive parentheses group.

                // If we find '(',
                // this is the OUTERMOST opening parenthesis.
                // Push it into stack but DON'T add it to ans.
                if(ch == '(') st.push(ch);

                // This case handles ')' when stack is empty.
                // Normally, for a valid parentheses string,
                // this won't occur.
                else if(ch == ')') st.pop();
            }
        } 
        // Return string after removing outermost parentheses  
        return ans;
    }
}