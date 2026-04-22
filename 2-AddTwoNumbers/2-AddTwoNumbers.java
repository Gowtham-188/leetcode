// Last updated: 4/22/2026, 3:49:20 PM
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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2)
     {
     ListNode gow=new ListNode(0);
     ListNode t=gow;
     int carry=0;

     while(l1!=null||l2!=null||carry!=0)
     {
        int sum=carry;
        if(l1!=null)
        {
           sum =l1.val+sum; 
           l1= l1.next;
        }
        if(l2!=null)
        {
          sum=l2.val+sum;
           l2= l2.next;
        }
        t.next=new ListNode(sum%10);
        carry=sum/10;
        t=t.next;

     }
    return gow.next;
    }
}