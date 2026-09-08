 // LeetCode 169 — Majority Element

 // Approach: Sorting
 // Sort the given array using Arrays.sort().
 // The majority element appears more than n/2 times.
 // Therefore, the middle element nums[n/2] will always be the majority element.

 // Time Complexity: O(n log n)
 // Sorting the array takes O(n log n) time.

 // Space Complexity: O(log n)
 // Arrays.sort() uses O(log n) extra space for primitive arrays.
class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        return nums[n/2];
    }
}
