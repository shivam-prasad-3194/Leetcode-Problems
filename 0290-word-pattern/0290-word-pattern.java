class Solution {
    //Time complexity: O(N)
    // Space complexity: O(N)
    public boolean wordPattern(String pattern, String s) {
        // Split the string s into string array
        String[] str = s.split(" ");

        // if length of pattern and str arry is not equal then return false
        if(pattern.length() != str.length) return false;

        // map stores character and word associated with that character
        HashMap<Character, String> map = new HashMap<>();


        for(int i = 0; i < str.length; i++){
            char ch = pattern.charAt(i);

            // if the current character is not stored in map
            if(!map.containsKey(ch)){
                // and if the current word is already mapped with another character in HashMap
                // Then return false
                if(map.containsValue(str[i])){
                    return false;
                }
                // else store the current character and word
                map.put(ch, str[i]);
            }

            // check if the current character is not mapped with current word then return false
            if(!map.get(ch).equals(str[i])){
                return false;
            }
        }
        // if conditions is passed then return true
        return true;
    }
}