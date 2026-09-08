// LeetCode 1929 — Concatenation of Array

// Approach: Array Traversal
// Create a new array of size 2 * nums.length.
// Traverse through nums using a for loop.
// Store each element in the first half of ans.
// Store the same element in the second half of ans.

// Time Complexity: O(n)
// Traverse the array only once.

// Space Complexity: O(n)
// A new array of size 2n is created.



class Solution {
    public int[] getConcatenation(int[] nums) {
        int ans[]=new int[nums.length*2];
        for(int i=0;i<nums.length;i++){
            ans[i]=nums[i];
            ans[i+nums.length]=nums[i];
        }
        return ans;
    }
}
