/**
 * LeetCode Problem: 160 - Intersection of Two Linked Lists
 *
 * Approach:
 * Use two pointers, temp1 and temp2.
 * Both pointers traverse their own list first.
 * When a pointer reaches null, move it to the head of the other list.
 * This makes both pointers travel the same total distance.
 * They will meet at the intersection node.
 * If there is no intersection, both will become null.
 *
 * Time Complexity: O(N + M)
 * Space Complexity: O(1)
 */

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */

public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        ListNode temp1 = headA;
        ListNode temp2 = headB;

        while (temp1 != temp2) {

            if (temp1 == null) {
                temp1 = headB;
            } else {
                temp1 = temp1.next;
            }

            if (temp2 == null) {
                temp2 = headA;
            } else {
                temp2 = temp2.next;
            }
        }

        return temp1;
    }
}
