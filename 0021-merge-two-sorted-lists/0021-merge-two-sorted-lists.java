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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode temp1=list1;
        ListNode temp2=list2;
        ListNode p=new ListNode(-1);
        ListNode p1=p;
        while(temp1!=null&&temp2!=null)
        {
            if(temp1.val<temp2.val)
            {
                p1.next=temp1;
                temp1=temp1.next;
            }
            else 
            {
                p1.next=temp2;
                temp2=temp2.next;
            }
           p1=p1.next;
        }
        if(temp1!=null)
        {
            p1.next=temp1;
        }
        else
        {
            p1.next=temp2;
        }
        return p.next;
    }
}