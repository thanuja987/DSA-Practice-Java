/**
 * LeetCode Problem: 896 - Monotonic Array
 *
 * Approach:
 * Assume the array is both increasing and decreasing.
 * Check every adjacent pair.
 * If nums[i] < nums[i+1], it is not decreasing.
 * If nums[i] > nums[i+1], it is not increasing.
 * Finally, return true if either condition is possible.
 *
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */

class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean increasing = true;
        boolean decreasing = true;

        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] < nums[i + 1]) {
                decreasing = false;
            }

            if (nums[i + 1] < nums[i]) {
                increasing = false;
            }
        }

        return increasing || decreasing;
    }
}
