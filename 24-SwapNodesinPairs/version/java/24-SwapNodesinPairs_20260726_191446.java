// Last updated: 7/26/2026, 7:14:46 PM
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    public ListNode swapPairs(ListNode head) {
13
14        // if(head  == null || head.next == null ) return head;
15        ListNode temp = new ListNode(0, head);
16        ListNode prev = temp ;
17        ListNode node = head ;
18        
19    
20        
21        while(node != null && node.next != null) {
22
23            ListNode n1 = node.next.next;
24            ListNode second = node.next;
25
26            second.next = node;
27            node.next = n1;
28            prev.next = second;
29
30            prev = node ;   
31            node = n1;
32        }
33
34        return temp.next;
35        
36    }
37}