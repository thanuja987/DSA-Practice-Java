// LeetCode 1343: Number of Sub-arrays of Size K and Average >= Threshold
// Approach: Sliding Window
// Calculate the sum of the first k elements.
// Slide the window by removing the left element and adding the next element.
// If the average is >= threshold, increment count.
// TC: O(n)
// SC: O(1)


class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int r=k-1;
        int l=0;
        int sum=0;
        int count=0;
        for(int i=l;i<=r;i++){
            sum+=arr[i];
        }
        if(sum/k>=threshold){
            count++;
        }
        while(r<arr.length-1){
           sum-=arr[l];
           l++;
           r++;
           sum+=arr[r];
           if(sum/k>=threshold){
            count++;
           }
        }
        return count;
    }
}
