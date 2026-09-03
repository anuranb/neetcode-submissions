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
        ListNode pointer = head;
        ListNode pointer2 = head;
        ListNode prev = null;
        while(n>0) {
            pointer = pointer.next;
            n--;
        }
        if(pointer == null) return head.next;

        while(pointer != null) {
            System.out.println(pointer.val+","+pointer2.val);            
            pointer = pointer.next;
            prev=pointer2;
            pointer2 = pointer2.next;

        }
        prev.next = pointer2.next;
        return head;
    }
}
