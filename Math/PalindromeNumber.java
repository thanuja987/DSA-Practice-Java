class Solution {
    // LeetCode 9 - Palindrome Number
    // Approach: Reverse the number and compare it with the original number.
    // Time Complexity: O(log10(n))
    // Space Complexity: O(1)

    public boolean isPalindrome(int x) {
        int rev = 0;
        int orig = x;

        // Negative numbers are not palindromes
        if (x < 0) {
            return false;
        }

        // Reverse the number
        while (x > 0) {
            int lastdigit = x % 10;

            // Add the last digit to the reversed number
            rev = (rev * 10) + lastdigit;

            // Remove the last digit from x
            x = x / 10;
        }

        // If original and reversed numbers are same,
        // then the number is a palindrome
        return orig == rev;
    }
}
