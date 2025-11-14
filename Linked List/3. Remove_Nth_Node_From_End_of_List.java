/*
19. Remove Nth Node From End of List (https://leetcode.com/problems/remove-nth-node-from-end-of-list/description/)
Input: head = [1,2,3,4,5], n = 2
Output: [1,2,3,5]
*/

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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        // Create a dummy node which next pointer points to the head
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        ListNode slow = dummy;
        ListNode fast = dummy;

        for(int i = 0; i <= n; i++) {
            fast = fast.next;
        }

        while(fast != null) {
            fast = fast.next;
            slow = slow.next;
        }        
        slow.next = slow.next.next;

        return dummy.next;
    }
}
