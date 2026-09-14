/**
 * LeetCode Problem: 88 - Merge Sorted Array
 *
 * Approach:
 * Use two pointers i and j to traverse nums1 and nums2.
 * Compare the elements of both arrays and store the smaller
 * element in a new array.
 * After one array is completely traversed, copy the remaining
 * elements of the other array.
 * Finally, copy the merged array back into nums1.
 *
 * Time Complexity: O(m + n)
 * Space Complexity: O(m + n)
 */

class Solution {

    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int i = 0;
        int j = 0;
        int k = 0;

        int[] array = new int[m + n];

        while (i <= m - 1 && j <= n - 1) {

            if (nums1[i] <= nums2[j]) {
                array[k] = nums1[i];
                i++;
                k++;
            } 
            else {
                array[k] = nums2[j];
                j++;
                k++;
            }
        }

        while (i <= m - 1) {
            array[k] = nums1[i];
            i++;
            k++;
        }

        while (j <= n - 1) {
            array[k] = nums2[j];
            j++;
            k++;
        }

        for (int l = 0; l < array.length; l++) {
            nums1[l] = array[l];
        }
    }
}
