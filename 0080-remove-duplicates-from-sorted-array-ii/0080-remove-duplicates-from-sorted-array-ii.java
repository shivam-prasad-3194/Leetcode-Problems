class Solution {
    // time complexity: O(n)
    // Space complexity: O(1)
    public int removeDuplicates(int[] nums) {
        if(nums.length <= 2) return nums.length;
        int k = 2; // k tracks the valid number index


        for(int i = 2; i < nums.length; i++){
            // if the second previous number is not equal to the current number 
            if(nums[i] != nums[k - 2]){
                // then place the curr valid element at next available index
                nums[k] = nums[i];
                k++;  // update the value of k
            }
        }
        return k;
    }
}