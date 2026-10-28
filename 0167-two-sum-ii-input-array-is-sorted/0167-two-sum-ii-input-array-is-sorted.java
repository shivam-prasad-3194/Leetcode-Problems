class Solution {
    // Two Pointer Approach
    // Time complexity: O(N)
    // Space complexity: O(1)
    public int[] twoSum(int[] nums, int target) {
        int st = 0;
        int end = nums.length - 1;

        while(st < end){
            // if the current sum is equal to target then return the index of st and end pointer by +1 due to the array is given 1-indexed
            if(nums[st] + nums[end] == target){
                return new int[]{st+1, end+1};
            }
            // if current sum is greater then the target then change the position of end pointer
            else if(nums[st] + nums[end] > target){
                end--;
            }
            // if current sum is smaller then the target then change to position of st pointer
            else if(nums[st] + nums[end] < target){
                st++;
            }
        }

        // if two sum is not found in the array then return {-1, -1}
        return new int[]{-1,-1};
    }
}