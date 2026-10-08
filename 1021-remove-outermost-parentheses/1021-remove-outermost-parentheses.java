class Solution {
    // Time complexity: O(N)
    // Space complexity: O(1)
    public String removeOuterParentheses(String s) {
        String ans = "";
        int counter = 0;
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '('){
                if(counter > 0){
                    ans += ch;
                }
                counter++;
            }else{
                counter--;
                if(counter > 0){
                    ans += ch;
                }
            }
            
        }
        return ans;
    }
}