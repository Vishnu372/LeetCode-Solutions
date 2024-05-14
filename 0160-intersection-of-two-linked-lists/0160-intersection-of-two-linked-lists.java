/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode heada, ListNode headb) {
        Stack<ListNode> st1=new Stack<>();
        Stack<ListNode> st2=new Stack<>();
        ListNode temp1=heada;
        ListNode temp2=headb;
        if(temp1==null||temp2==null)
        {
            return null;
        }
        while(temp1!=null)
        {
            st1.push(temp1);
            temp1=temp1.next;
        }
         while(temp2!=null)
        {
            st2.push(temp2);
            temp2=temp2.next;
        }
        ListNode val=null;
        while(!st1.isEmpty()&&!st2.isEmpty())
        {
            if(st1.peek()==st2.peek())
            {
                val=st1.pop();
                st2.pop();
            }
            else
            {
                break;
            }
        }
        return val;
    }
}