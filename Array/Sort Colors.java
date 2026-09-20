class Solution {
    public void sortColors(int[] nums) {
        // LeetCode 75 - Sort Colors
        // Approach: Dutch National Flag Algorithm
        // low -> position for 0
        // mid -> current element
        // high -> position for 2
        // If nums[mid] is 0, swap with low and move both
        // If nums[mid] is 1, just move mid
        // If nums[mid] is 2, swap with high and move high
        // TC: O(n)
        // SC: O(1)

        int low = 0;
        int mid = 0;
        int high = nums.length - 1;

        while (mid <= high) {
            if (nums[mid] == 0) {
                int temp = nums[mid];
                nums[mid] = nums[low];
                nums[low] = temp;
                low++;
                mid++;
            } 
            else if (nums[mid] == 1) {
                mid++;
            } 
            else {
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high--;
            }
        }
    }
}
