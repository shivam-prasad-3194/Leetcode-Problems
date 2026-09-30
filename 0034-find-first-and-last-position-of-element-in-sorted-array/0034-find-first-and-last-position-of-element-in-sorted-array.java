class Solution {
    // Time complexity: O(log n)
    // Space complexity: O(1)
    public int[] searchRange(int[] nums, int target) {
        int st = 0, end = nums.length - 1;
        int first = -1;  // stores first position index
        int last = -1;   // stores last position index

        // Finding first occurence
        while(st <= end){
            int mid = st + (end - st)/2;
            if(nums[mid] == target){
                first = mid;  // target found
                end = mid - 1;  // don't stop here, there may be another target on LEFT
            }else if(nums[mid] > target){
                end = mid - 1;
            }else{
                st = mid + 1;
            }
        }

        // if target is not found in the nums array return {-1, -1}
        if(first == -1) return new int[]{-1, -1};

        // Finding last occurences
        // reset search range st and end
        st = 0; end = nums.length - 1;
        while(st <= end){
            int mid = st + (end - st)/2;
            if(nums[mid] == target){
                last = mid; // target found
                st = mid + 1; // don't stop here there may be another target on RIGHT
            }else if(nums[mid] > target){
                end = mid - 1;
            }else{
                st = mid + 1;
            }
        }

        // return the first and last occurences of target
        return new int[]{first, last};
    }
}