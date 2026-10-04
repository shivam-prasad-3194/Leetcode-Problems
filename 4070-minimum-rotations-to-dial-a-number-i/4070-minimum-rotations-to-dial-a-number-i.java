class Solution {
    public int minRotations(String s) {
        int curr = 0;
        int rotation = 0;
        for(int i = 0; i < s.length(); i++){
            int target = s.charAt(i) - '0';
            int diff = Math.abs(curr - target);

            rotation += Math.min(diff, 10 - diff);
            curr = target;
        }
        return rotation;
    }
}