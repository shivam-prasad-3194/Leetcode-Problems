class Solution {
    // Brute force Approach
    // Time complexity: O(N)
    // Space complexity: O(1)
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String s1 = "";
        for(int i = 0; i < word1.length; i++){
            s1 += word1[i];
        }
        String s2 = "";
        for(int i = 0; i < word2.length; i++){
            s2 += word2[i];
        }

        if(s1.length() != s2.length()) return false;
        for(int i = 0; i < s1.length(); i++){
            char ch1 = s1.charAt(i);
            char ch2 = s2.charAt(i);

            if(ch1 != ch2) return false; 
        }
        return true;
    }
}