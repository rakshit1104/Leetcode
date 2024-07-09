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
        int maxValue = Integer.MIN_VALUE;
        ListNode slow = head;
        ListNode fast = head.next;

        while(fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode prev = null;
        ListNode nextNode = null;
        while(slow != null){
            nextNode = slow.next;
            slow.next = prev;
            prev = slow;
            slow = nextNode;
        }

        while(prev.next != null){
            maxValue = Math.max(maxValue, (head.val + prev.val));
            prev = prev.next;
            head = head.next;
        }
        return maxValue;
    }
}