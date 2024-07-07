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
    public ListNode reverseKGroup(ListNode head, int k) {

       int count = 0;
       ListNode start = head;
       ListNode end = head;
       ListNode newHead = head;
       ListNode prev = new ListNode();

       while(end != null){
            count++;
            if(count == k){
                newHead = end;
            }

            if(count % k == 0){
                ListNode newNode = end.next;
                ListNode node = reverse(start, end, k);
                prev.next = node;
                prev = start;
                start = newNode;
                end = start;
                continue;
            }
            end = end.next;
       }
       return newHead;
    }

    private ListNode reverse(ListNode start, ListNode end, int k){

        ListNode curr = start;
        ListNode prev = end.next;
        ListNode next = null;
        for(int i = 0 ; i < k ; i++){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}