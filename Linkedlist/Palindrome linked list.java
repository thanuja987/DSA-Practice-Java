// LeetCode Problem: #234 - Palindrome Linked List
// Approach: Use a Stack
// 1. Traverse the linked list and push all node values into the stack.
// 2. Traverse the linked list again.
// 3. Compare each node value with the value popped from the stack.
// 4. If any value is different, return false.
// 5. If all values match, return true.

// Time Complexity: O(n)
// Space Complexity: O(n)

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        Stack <Integer>st=new Stack<>();
        ListNode temp=head;
        while(temp!=null){
            st.push(temp.val);
            temp=temp.next;
        }
        ListNode temp1=head;
        while(temp1!=null){
           if( temp1.val!=st.pop()){
            return false;
           }
            temp1=temp1.next;
        }
        return true;
    }
}
