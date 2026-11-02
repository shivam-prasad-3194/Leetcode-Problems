/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    // Time complexity: O(log n)
    // Space complexity: O(1)
    // Binary search approach
    public int firstBadVersion(int n) {
        int left = 1;
        int right = n;

        while(left < right){
            int mid = left + (right - left) / 2;
            // check if the mid element is a bad version then shift the right pointer to mid for finding first bad version
            if(isBadVersion(mid)){
                right = mid;
            }
            // else shift the left pointer to mid + 1 position
            else{
                left = mid + 1;
            }
        }
        // at end left and right both point at the first bad version
        return left;
        // return right;
    }
}