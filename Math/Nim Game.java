class Solution {

    public boolean canWinNim(int n) {

        // LeetCode #292 - Nim Game
        //
        // Approach:
        // If n is divisible by 4, we cannot win.
        // Otherwise, we can always make a move that leaves
        // a multiple of 4 stones for the opponent.
        //
        // Therefore:
        // n % 4 == 0  -> false
        // n % 4 != 0  -> true
        //
        // Time Complexity: O(1)
        // Space Complexity: O(1)

        return n % 4 != 0;
    }
}
