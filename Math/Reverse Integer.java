class Solution {
    // LeetCode 7 - Reverse Integer
    // Approach: Extract the last digit and build the reversed number.
    // Before multiplying by 10, check for integer overflow.
    // Time Complexity: O(log10(n))
    // Space Complexity: O(1)

    public int reverse(int x) {
        int rev = 0;

        // Continue until all digits are processed
        while (x != 0) {

            // Get the last digit
            int ld = x % 10;

            // Check if reversing will cause integer overflow
            if (rev > Integer.MAX_VALUE / 10 ||
                rev < Integer.MIN_VALUE / 10) {
                return 0;
            }

            // Add the last digit to the reversed number
            rev = (rev * 10) + ld;

            // Remove the last digit from x
            x = x / 10;
        }

        // Return the reversed number
        return rev;
    }
}
