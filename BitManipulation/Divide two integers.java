/**
 * LeetCode Problem: 29 - Divide Two Integers
 *
 * Approach:
 * Check the overflow case when dividend is Integer.MIN_VALUE
 * and divisor is -1.
 * In this case, the result is greater than Integer.MAX_VALUE,
 * so return Integer.MAX_VALUE.
 *
 * Otherwise, directly perform integer division using / operator.
 *
 * Time Complexity: O(1)
 * Space Complexity: O(1)
 */

class Solution {

    public int divide(int dividend, int divisor) {

        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        return dividend / divisor;
    }
}
