class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null) return head;
        ListNode temp=head;
        ListNode check=temp.next;
        ListNode dummy=new ListNode(0);
        dummy.next=head;
        temp=dummy;
        while(temp.next!=null){
            check=temp.next;
            if(check.next!=null && check.val==check.next.val){
                while(check.next!=null && check.val==check.next.val){
                    check=check.next;
                }
                temp.next=check.next;
            }
            else{
                temp=temp.next;
            }
        }
        return dummy.next;
    }
}