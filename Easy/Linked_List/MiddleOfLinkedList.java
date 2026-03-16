package Linked_List;


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
