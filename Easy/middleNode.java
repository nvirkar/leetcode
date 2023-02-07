// Leetcode-876
// Middle of the Linked List
// https://leetcode.com/problems/middle-of-the-linked-list/description/

class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}