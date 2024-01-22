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
        if(head==null || head.next==null) return head;
        ListNode dummy=new ListNode(-1);
        dummy.next=head;
        ListNode prevIt=null,it=dummy;
        for(int i=0;i<left;i++){
            prevIt=it;
            it=it.next;
        }
        ListNode prevItR=prevIt,itR=it;
        for(int i=left;i<=right;i++)
        {
            ListNode forward=itR.next;
            itR.next=prevItR;
            prevItR=itR;
            itR=forward;
        }
        prevIt.next=prevItR;
        it.next=itR;
        return dummy.next;
    }
}