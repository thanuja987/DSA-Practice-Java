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
