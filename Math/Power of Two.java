/**
 * LeetCode Problem: 231 - Power of Two
 *
 * Approach:
 * A positive power of 2 has exactly one set bit in its binary form.
 *
 * Example:
 * 8  = 1000
 * 7  = 0111
 *
 * 8 & 7 = 0000
 *
 * Therefore, if (n & (n - 1)) == 0, n is a power of 2.
 *
 * Time Complexity: O(1)
 * Space Complexity: O(1)
 */

class Solution {

    public boolean isPowerOfTwo(int n) {

        if (n == 0 || n == Integer.MIN_VALUE) {
            return false;
        }

        if ((n & (n - 1)) == 0) {
            return true;
        }

        return false;
    }
}
