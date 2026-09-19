class Solution {
    // LeetCode 268 - Missing Number
    // Approach: Find the expected sum of numbers from 0 to n
    // and subtract the actual sum of elements in the array.
    // Time Complexity: O(n)
    // Space Complexity: O(1)

    public int missingNumber(int[] nums) {
        int mainsum = 0;
        int arraysum = 0;

        // Calculate the sum of numbers from 0 to n
        mainsum = nums.length * (nums.length + 1) / 2;

        // Calculate the sum of elements present in the array
        for (int i = 0; i < nums.length; i++) {
            arraysum += nums[i];
        }

        // Difference gives the missing number
        return mainsum - arraysum;
    }
}
