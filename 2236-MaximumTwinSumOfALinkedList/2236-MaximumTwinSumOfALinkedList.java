// Last updated: 4/22/2026, 3:44:21 PM
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
    public int pairSum(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;

        while (fast!=null)
        {
            slow=slow.next;
            fast=fast.next.next;

        }
        
        ListNode prev=null;

        while (slow!=null)
        {
            ListNode next=slow.next;
            slow.next=prev;
            prev=slow;
            slow=next;

        }
        int maxsum=0;
        while (head!=null && prev!=null)
        {
            maxsum=Math.max(head.val+prev.val,maxsum);

            head=head.next;
            prev=prev.next;
        }
        return maxsum;
    }
}