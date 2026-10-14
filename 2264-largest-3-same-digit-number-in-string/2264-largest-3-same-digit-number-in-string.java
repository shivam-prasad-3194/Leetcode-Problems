class Solution {
    public String largestGoodInteger(String num) {
        String largest = "";
        int curr = -1;
        for(int i = 0; i < num.length() - 2; i++){
            char ch = num.charAt(i);
            char ch1 = num.charAt(i + 1);
            char ch2 = num.charAt(i + 2);
            if(ch == ch1 && ch == ch2 && curr < (ch - '0')){
                largest = "";
                largest += ch;
                largest += ch1;
                largest += ch2;
                curr = ch - '0';
                if(curr == 0){
                    largest = "000";
                }
            }
        }
        return largest;
    }
}