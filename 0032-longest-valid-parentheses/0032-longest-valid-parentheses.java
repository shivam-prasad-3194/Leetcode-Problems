class Solution {
    // Time complexity: O(N)
    // Space complexity: O(1)
    public int longestValidParentheses(String s) {
        int open = 0;  // count opening parenthesis
        int close = 0;  // count closing parenthesis
        int maxLength = 0;  // stores maximum valid length

        // traversing left to right 
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '(') open++;
            else close++;

            // if opening and closing bracket is equal then we have valid balanced substring
            if(open == close){
                maxLength = Math.max(maxLength, 2 * close);
            }
            // More ')' than '(' means this part can never be valid
            // So start counting again from the next character
            else if(close > open){
                open = 0;
                close = 0;
            }
        }

        // reset the counter for traversing the string from right to left
        open = close = 0;

        for(int i = s.length() - 1; i >= 0; i--){
            char ch = s.charAt(i);
            if(ch == '(') open++;
            else if (ch == ')') close++;

            // if opening and closing bracket is equal then we have valid balanced substring
            if(open == close){
                maxLength = Math.max(maxLength, 2 * open);
            }
            // More '(' than ')' means this part cannot be valid
            // when scanning from right to left
            else if(open > close){
                open = 0; 
                close = 0;
            }
        }
        return maxLength;
    }
}