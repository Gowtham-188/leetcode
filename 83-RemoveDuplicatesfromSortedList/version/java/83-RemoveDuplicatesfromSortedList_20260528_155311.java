// Last updated: 5/28/2026, 3:53:11 PM
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
12    public ListNode deleteDuplicates(ListNode head) {
13
14        ListNode res = head;
15
16        while( head != null && head.next != null)
17        {
18            if(head.val == head.next.val)
19            {
20                head.next = head.next.next;
21            }
22            else
23            {
24                head = head.next;
25            }
26        }
27        return res;
28        
29         
30        
31    }
32}