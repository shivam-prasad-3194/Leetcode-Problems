class Solution {
    // Time complexity: O(N)
    // space complexity: O(1)
    public int minAddToMakeValid(String s) {
        int openReq = 0;
        int closeReq = 0;
        for(int i = 0; i < s.length(); i++){
            char ch  = s.charAt(i);

            // if current character is '(' i.e., 1 '(' is unmatched available
            if(ch == '(') openReq++;

            // if current character is ')' then
            else{
                // if any '(' is availble to match the current ')' then reduce the the openReq available
                if(openReq > 0){
                    openReq--;
                }
                // if no any '(' is available to match the current ')' then update the closeReq by one
                else{
                    closeReq++;
                }
            }
        }

        // return number of openReq and closeReq
        return openReq + closeReq;
    }
}