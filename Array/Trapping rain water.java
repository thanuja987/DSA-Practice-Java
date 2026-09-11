// LeetCode 42 - Trapping Rain Water
// Approach: Prefix Max + Suffix Max
// Time Complexity: O(n)
// Space Complexity: O(n)

class Solution {

    public int trap(int[] height) {

        int leftmax[] = new int[height.length];
        int rightmax[] = new int[height.length];

        // Store maximum height from left
        leftmax[0] = height[0];

        for (int i = 1; i < height.length; i++) {
            leftmax[i] = Math.max(height[i], leftmax[i - 1]);
        }

        // Store maximum height from right
        rightmax[height.length - 1] = height[height.length - 1];

        for (int i = height.length - 2; i >= 0; i--) {
            rightmax[i] = Math.max(height[i], rightmax[i + 1]);
        }

        int trappedwater = 0;

        // Calculate water trapped at each index
        for (int i = 0; i < height.length; i++) {

            int waterlevel = Math.min(leftmax[i], rightmax[i]);

            trappedwater += waterlevel - height[i];
        }

        return trappedwater;
    }
}
