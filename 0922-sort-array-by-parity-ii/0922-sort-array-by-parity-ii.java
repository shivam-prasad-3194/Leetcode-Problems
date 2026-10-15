class Solution {
    // Time complexity: O(N)
    // Space complexity: O(1)
    public int[] sortArrayByParityII(int[] nums) {
        int even = 0; // tracks the even idx
        int odd = 1; // tracks odd idx
        int n = nums.length;

        while(even < n && odd < n){
            // if at even index the number is also even then update the even by +2
            if(nums[even] % 2 == 0){
                even += 2;
            }
            // if at odd index the number is also odd then update the odd by +2
            else if(nums[odd] % 2 == 1){
                odd += 2;
            }
            // if at even index even number is not present and at odd index odd number is not present then swap the number and place the even number at even index and odd number at odd index
            else{
                int temp = nums[odd];
                nums[odd] = nums[even];
                nums[even] = temp;
            }
        }
        return nums;
    }
}