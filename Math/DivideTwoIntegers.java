// LeetCode 29: Divide Two Integers
// Approach: Handle Integer.MIN_VALUE / -1 overflow case,
// otherwise use the division operator.
// TC: O(1)
// SC: O(1)

class Solution {
    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }
        return dividend / divisor;
    }
}
