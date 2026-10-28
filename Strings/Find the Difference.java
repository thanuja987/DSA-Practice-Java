// LeetCode 389: Find the Difference

class Solution {
    public char findTheDifference(String s, String t) {
        // Initialize ans to 0
        char ans = 0;

        // XOR all characters of string s
        for (int i = 0; i < s.length(); i++) {
            ans ^= s.charAt(i);
        }

        // XOR all characters of string t
        for (int i = 0; i < t.length(); i++) {
            ans ^= t.charAt(i);
        }

        // Identical characters cancel using XOR
        // The remaining character is the extra character
        return ans;
    }
}

/*
Approach:
1. XOR all characters of both strings.
2. Identical characters cancel because a ^ a = 0.
3. XOR with 0 returns the same character.
4. The remaining character is the extra character in t.

Time Complexity (TC): O(n)
Space Complexity (SC): O(1)
*/ 
