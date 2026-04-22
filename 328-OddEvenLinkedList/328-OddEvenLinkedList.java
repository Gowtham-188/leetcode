// Last updated: 4/22/2026, 3:46:55 PM
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
    public ListNode oddEvenList(ListNode head) {

        if(head==null)
        {
            return null;
        }
        ListNode gow1=head;
        ListNode gow2=head.next;

        ListNode tem1=gow1;
        ListNode tem2=gow2;

        while (tem2!=null && tem2.next!=null)
        {

            tem1.next=tem2.next;

            tem1=tem1.next;

            tem2.next=tem1.next;
            tem2=tem2.next;
        }
        tem1.next=gow2;
        return gow1;
        
    }
}