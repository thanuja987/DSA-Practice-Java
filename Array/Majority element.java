// LeetCode 169: Majority Element
// Time Complexity: O(n log n)
// Space Complexity: O(log n)
class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        return nums[n/2];
    }
}
