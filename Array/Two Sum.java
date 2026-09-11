 // LeetCode #1 - Two Sum
// Approach:
        // Check every possible pair (i, j).
        // If nums[i] + nums[j] == target, return their indices.

        // Time Complexity: O(n^2)
        // Two nested loops check all possible pairs.

        // Space Complexity: O(1)
        // No extra data structure is used.
class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                         if(nums[i]+nums[j]==target){
                    return new int[]{start,j};
                }
            }
            
        }
        return new int[]{};
    }
}
