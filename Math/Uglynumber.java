// LeetCode 263: Ugly Number
// Approach: Repeated Division
// Divide n by 2, 3, and 5 until it is no longer divisible.
// If the remaining value is 1, it is an ugly number.
// TC: O(log n)
// SC: O(1)

class Solution {
    public boolean isUgly(int n) {
        if (n <= 0) {
            return false;
        }

        while (n % 2 == 0) {
            n = n / 2;
        }

        while (n % 3 == 0) {
            n = n / 3;
        }

        while (n % 5 == 0) {
            n = n / 5;
        }

        return n == 1;
    }
}
