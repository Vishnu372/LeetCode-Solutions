public class Solution {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false; // If the list is empty or has only one node, there can't be a cycle
        }
        
        ListNode slow = head;
        ListNode fast = head.next; // Fast pointer moves two steps at a time initially
        
        while (fast != null && fast.next != null) {
            if (slow == fast) {
                return true; // If slow and fast pointers meet, there's a cycle
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        
        return false; // If fast pointer reaches the end, there's no cycle
    }
}
