/**
 * LeetCode Problem: 21 - Merge Two Sorted Lists
 *
 * Approach:
 * Use a dummy node and a temp pointer.
 * Compare the values of both lists and attach the smaller node.
 * Move the pointer of the selected list.
 * Finally, attach the remaining nodes.
 *
 * Time Complexity: O(n + m)
 * Space Complexity: O(1)
 */

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(-1);
        ListNode temp = dummy;

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                temp.next = list1;
                temp = list1;
                list1 = list1.next;
            } else {
                temp.next = list2;
                temp = list2;
                list2 = list2.next;
            }
        }

        if (list1 != null) {
            temp.next = list1;
        }

        if (list2 != null) {
            temp.next = list2;
        }

        return dummy.next;
    }
}
