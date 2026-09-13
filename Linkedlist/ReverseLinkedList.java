// LeetCode Problem: #206 - Reverse Linked List
// Approach: Iterative approach using three pointers
// 1. Use temp to traverse the linked list.
// 2. Store the next node in front before changing the link.
// 3. Reverse the current node's next pointer to prev.
// 4. Move prev and temp one step forward.
// 5. At the end, prev becomes the new head.
//
// Time Complexity: O(n)
// Space Complexity: O(1)

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
    public ListNode reverseList(ListNode head) {
        ListNode temp=head;
        ListNode prev=null;

        while(temp!=null){
          ListNode front =temp.next;
           temp.next=prev;
           prev=temp;
           temp=front;
        }
        return  prev;
    }
}
