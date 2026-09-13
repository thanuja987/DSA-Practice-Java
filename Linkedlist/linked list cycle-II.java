// LeetCode Problem: #142 - Linked List Cycle II
// Approach: Floyd's Cycle Detection Algorithm
// 1. Use slow and fast pointers.
// 2. slow moves 1 step, fast moves 2 steps.
// 3. If they meet, a cycle exists.
// 4. Move slow back to head.
// 5. Move both one step at a time.
// 6. They meet at the starting node of the cycle.
// 7. If fast reaches null, there is no cycle.

// Time Complexity: O(n)
// Space Complexity: O(1)
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                slow=head;
                while(slow!=fast){
                slow=slow.next;
                fast=fast.next;
                }
                return slow;
            }
        }
        return null;
    }
}
