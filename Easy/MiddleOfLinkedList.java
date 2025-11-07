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
class MiddleOfLinkedList {
    public ListNode middleNode(ListNode head) {
         ListNode current = head;
        int count = 0;
        while (current != null) {
            current = current.next;
            count++;
        }
        int mid=count/2;            
        current = head;
        for (int i = 0; i < mid; i++) {
            current = current.next;
        }
        return current;
    }
}
