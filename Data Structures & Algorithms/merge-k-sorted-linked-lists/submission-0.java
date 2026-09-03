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
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) {
return null;
}
        PriorityQueue<ListNode> pq = new PriorityQueue<>((a,b) ->  Integer.compare(a.val,b.val));

        for(ListNode l: lists) {
            if(l!=null)
                pq.offer(l);
        }
        ListNode dummy = new ListNode(0);
        ListNode head = dummy;
        while(!pq.isEmpty()) {
            ListNode curr=pq.poll();
            dummy.next=curr;
            if(curr.next!=null) {
                pq.add(curr.next);
            }
            dummy=dummy.next;
        }
        return head.next;
    }
}
