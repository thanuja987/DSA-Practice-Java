class Solution {
    public int countPrimes(int n) {
        
        // LeetCode 204 - Count Primes
        // Approach: Sieve of Eratosthenes
        // Time Complexity: O(n log log n)
        // Space Complexity: O(n)

        if (n < 2) {
            return 0;
        }

        // prime[i] = true means i is prime
        boolean[] prime = new boolean[n];

        // Initially mark all numbers from 2 to n-1 as prime
        for (int i = 2; i < n; i++) {
            prime[i] = true;
        }

        // Mark multiples of each prime as not prime
        for (int i = 2; i * i < n; i++) {
            if (prime[i]) {

                // Start from i*i because smaller multiples
                // have already been checked
                for (int j = i * i; j < n; j += i) {
                    prime[j] = false;
                }
            }
        }

        int count = 0;

        // Count all numbers that are still marked as prime
        for (int i = 2; i < n; i++) {
            if (prime[i]) {
                count++;
            }
        }

        return count;
    }
}
