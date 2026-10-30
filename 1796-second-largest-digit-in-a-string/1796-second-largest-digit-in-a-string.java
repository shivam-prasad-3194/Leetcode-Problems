class Solution {
    // Time complexity: O(N)
    // Space complexity: O(1)
    public int secondHighest(String s) {
        int firstLargest = Integer.MIN_VALUE; 
        int secondLargest = Integer.MIN_VALUE;
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);

            // if the current character is a digit/number 
            if(ch >= '0' && ch <= '9'){
                int num = ch - '0';
                // then check if the number is greater than the firstLargest number 
                //  if the number is greater then first largest
                // firstLargest is updated to that number and the secondLargest is updated with first largest
                if(num > firstLargest){
                    secondLargest = firstLargest;
                    firstLargest = ch - '0';
                }
                //else if the number is smaller than firstLargest and greater then secondLargest
                // Then update the second largest to that number
                else if(num < firstLargest && num > secondLargest){
                    secondLargest = num;
                }
            }   
        }
        // if secondLargest is not found that is the value of secondLargest is Still -Infinity then return -1;
        return secondLargest == Integer.MIN_VALUE ? -1 : secondLargest;
    }
}