class Solution {

    public int singleNumber(int[] nums) {

        // LeetCode #136 - Single Number
        // Approach:
        // XOR all elements.
        // Same numbers cancel each other because a ^ a = 0.
        // 0 ^ number = number.
        // The remaining value is the single number.

        int result = 0;

        for (int i = 0; i < nums.length; i++) {
            result ^= nums[i];
        }

        return result;
    }
}
