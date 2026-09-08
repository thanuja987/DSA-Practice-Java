// LeetCode 11 — Container With Most Water

// Approach: Two Pointer
// Set left = 0 and right = n-1.
// Calculate the area using the two heights.
// Update maxarea.
// Move the pointer with the smaller height,
// because moving the taller one cannot increase the area.
// Continue until left < right.

// Time Complexity: O(n)
// Each pointer moves at most n times.

// Space Complexity: O(1)
// Only a few variables are used.


class Solution {
    public int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;;
        int maxarea=0;
        while(left<right){
            int width=right-left;
            int ht=Math.min(height[left],height[right]);
            int currarea=width*ht;
            maxarea=Math.max(currarea,maxarea);
            if(height[left]<height[right]){
                left++;
            }else{
                right--;
            }
        }
        return maxarea;
    }
}
