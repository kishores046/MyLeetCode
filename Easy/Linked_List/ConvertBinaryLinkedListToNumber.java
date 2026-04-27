package Linked_List;

public class ConvertBinaryLinkedListToNumber {
    public int getDecimalValue(ListNode head) {
        StringBuilder sb=new StringBuilder();
        ListNode currentNode=head;
        while(currentNode!=null){
            sb.append(currentNode.val);
            currentNode=currentNode.next;
        }
        return Integer.parseInt(sb.toString(),2);

    }
}
