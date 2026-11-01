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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode summa=null;
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode prevprev=dummy;
        ListNode prev=head;
        for(int i=0;i<left-1;i++){
            prevprev=prevprev.next;
            prev=prev.next;
        }
        ListNode r=prev;
        ListNode curr=prev;
        for(int i=0;i<right-left+1;i++){
            prev=curr;
            curr=curr.next;
            prev.next=summa;
            summa=prev;
        }
        prevprev.next=summa;
        r.next=curr;
        return dummy.next;
  }
}