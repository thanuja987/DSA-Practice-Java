class Solution {
    // LeetCode 69 - Sqrt(x)
    // Approach: Check every number from 0 until i*i becomes greater than x.
    // Store the largest i whose square is less than or equal to x.
    // Time Complexity: O(sqrt(n))
    // Space Complexity: O(1)

    public int mySqrt(int x) {
        int ans = 0;

        // Check all possible square roots
        for (long i = 0; i * i <= x; i++) {

            // Store the current valid square root
            ans = (int) i;
        }

        // Return the integer square root
        return ans;
    }
}
