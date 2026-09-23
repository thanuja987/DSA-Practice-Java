class Solution {
    public int hammingWeight(int n) {
        
        // LeetCode #191 - Number of 1 Bits
        // Approach:
        // 1. Check the last bit using (n & 1).
        // 2. If the last bit is 1, increment count.
        // 3. Right shift n by 1 to check the next bit.
        // 4. Repeat until n becomes 0.
        
        int count = 0;

        while (n != 0) {
            if ((n & 1) == 1) {
                count++;
            }

            n = n >> 1;
        }

        return count;
    }
}
