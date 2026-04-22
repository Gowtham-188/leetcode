// Last updated: 4/22/2026, 3:47:12 PM
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
    public boolean isPalindrome(ListNode head) {

     /* //  int n=head.size();
       //  int count=0;
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            if(head.val)
            {
              count++;
            }
            else
            {
                list.add(head.val(i));
            }
        }

         return (count==n/2);*/
        

        List<Integer> list =new ArrayList();

        while (head !=null)
        {
            list.add(head.val);
            head=head.next;
        }
        int left=0;
        int right=list.size()-1;
        while (left<right && list.get(left)==list.get(right))
        {
            left++;
            right--;
        }
        return left>=right;   //2>=1
    }
}