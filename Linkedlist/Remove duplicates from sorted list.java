// LeetCode 83 - Remove Duplicates from Sorted List
// Approach: Traverse the list and skip duplicate nodes
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public ListNode deleteDuplicates(ListNode head) {

        // If the list is empty
        if (head == null) {
            return null;
        }

        ListNode temp = head;

        while (temp.next != null) {

            // If current and next values are same
            if (temp.val == temp.next.val) {

                // Skip the duplicate node
                temp.next = temp.next.next;

            } else {

                // Move to the next node
                temp = temp.next;
            }
        }

        return head;
    }
}
