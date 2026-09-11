// LeetCode 203 - Remove Linked List Elements
// Approach: Previous and Current Pointer
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public ListNode removeElements(ListNode head, int val) {

        // If list is empty
        if (head == null) {
            return null;
        }

        // Remove matching nodes from the beginning
        while (head != null && head.val == val) {
            head = head.next;
        }

        ListNode temp = head;
        ListNode prev = null;

        while (temp != null) {

            if (temp.val == val) {
                // Remove current node
                prev.next = temp.next;
            } 
            else {
                // Move prev forward
                prev = temp;
            }

            // Move temp forward
            temp = temp.next;
        }

        return head;
    }
}
