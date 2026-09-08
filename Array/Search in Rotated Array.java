// LeetCode 33 — Search in Rotated Sorted Array

// Approach: Linear Search
// Traverse the array from left to right.
// Compare each element with the target.
// If nums[i] == target, return its index.
// If the target is not found, return -1.

// Time Complexity: O(n)
// In the worst case, we may check every element.

// Space Complexity: O(1)
// Only a few variables are used.

class Solution {

    public int search(int[] nums, int target) {

        for(int i = 0; i < nums.length; i++) {

            if(nums[i] == target) {
                return i;
            }
        }

        return -1;
    }
}
