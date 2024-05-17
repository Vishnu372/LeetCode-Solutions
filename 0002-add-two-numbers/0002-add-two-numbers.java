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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1==null&&l2==null)
        {
            return null;
        }
        ListNode p=new ListNode();
        ListNode Phead=p;
        ListNode ptemp=p;
        int rem=0;
        while(l1!=null||l2!=null)
        {
            int val2=(l1!=null)?l1.val:0;
            int val1=(l2!=null)?l2.val:0;
           int val=val2+val1+rem;
            if(val<10)
            {
                ptemp.next= new ListNode(val);
                rem=0;
            }
            else
            {
                rem=val/10;
                val=val%10;
                ptemp.next= new ListNode(val);
            }
            ptemp=ptemp.next;
            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }
        if(rem>0)
        {
            ptemp.next=new ListNode(rem);
        }
        return Phead.next;
    }
}