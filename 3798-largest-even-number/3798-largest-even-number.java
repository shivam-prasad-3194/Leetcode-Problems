class Solution {
    public String largestEven(String s) {
        StringBuilder largest = new StringBuilder("");
        for(int i = s.length() - 1; i >= 0; i--){
            int ch = s.charAt(i) - '0';
            if(ch % 2 == 0){
                largest.append(s, 0, i + 1); 
                break;
            }
        }
        return largest.toString();
    }
}