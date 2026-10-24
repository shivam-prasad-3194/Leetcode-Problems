class Solution {
    // Time complexity: O(N)
    // Space Complexity: O(N)
    public List<Integer> findDisappearedNumbers(int[] nums) {
        // list stores all disappeared number in array
        List<Integer> ans = new ArrayList<>();
        // num check the number is present in the array or not if present then mark that index - 1 as true
        boolean num[] = new boolean[nums.length];

        // traverse the nums array and check which element is present in nums array and mark that element in num array as true 
        for(int i = 0; i <  nums.length; i++){
            num[nums[i] - 1] = true;  // marking -1 index due to 0 based indexing
        }


        // traverse the num array and find all index where false is stores 
        // that index + 1 is store in ans list
        for(int i = 0; i < num.length; i++){
            if(!num[i]){
                ans.add(i + 1);
            }
        }
        return ans;
    }
}