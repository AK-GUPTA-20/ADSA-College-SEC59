/*
206. Reverse Linked List   (https://leetcode.com/problems/reverse-linked-list/)
Input: head = [1,2,3,4,5]
Output: [5,4,3,2,1]
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
    public ListNode reverseList(ListNode head) {
        ListNode next = null;
        while (head != null) {
            ListNode temp = head.next;
            head.next = next;
            next = head;
            head = temp;
        }

        return next;  
        
    }
}
