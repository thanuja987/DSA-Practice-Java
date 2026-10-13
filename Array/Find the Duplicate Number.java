// LeetCode 268: Missing Number
// Approach: Sum Formula
// Find the expected sum of numbers from 0 to n using n*(n+1)/2.
// Calculate the array sum and subtract it from the expected sum.
// The difference is the missing number.
// TC: O(n)
// SC: O(1)

class Solution {
    public int missingNumber(int[] nums) {
        int mainsum=0;
        int arraysum=0;
       for(int i=0;i<nums.length;i++){
           mainsum=nums.length*(nums.length+1)/2;
            arraysum+=nums[i];
       }
       return mainsum-arraysum;
    }
}
