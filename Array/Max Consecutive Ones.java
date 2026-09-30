class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        
        // LeetCode #485 - Max Consecutive Ones
        //
        // Approach:
        // 1. Use 'count' to store the current consecutive 1s.
        // 2. If nums[i] == 1, increase count.
        // 3. Update max with the maximum consecutive 1s found.
        // 4. If nums[i] == 0, reset count to 0.
        //
        // Time Complexity: O(n)
        // Space Complexity: O(1)

        int max = 0;
        int count = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 1) {
                count++;
                max = Math.max(max, count);
            } else {
                count = 0;
            }
        }

        return max;
    }
}
