package Linked_List;

class MergeTwoLinkedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode p1=list1;
        ListNode p2=list2;
        ListNode mergedList=new ListNode(0);
        ListNode temp=mergedList;
        while(p1!=null && p2!=null){
            if(p1.val<p2.val){
                mergedList.next=p1;
                p1=p1.next;
            }else{
                mergedList.next=p2;
                p2=p2.next;
            }

            mergedList=mergedList.next;
        }
        if(p1!=null)mergedList.next=p1;
        if(p2!=null)mergedList.next=p2;
        return temp.next ;
    }
}