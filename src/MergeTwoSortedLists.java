
//worst case time, n.
public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        var head = new ListNode();
        var mergedList = head;

        while(list1.next !=null && list2.next !=null){

            if(list1.val <= list2.val){
                var node = new ListNode(list1.val);
                mergedList.next = node;
                mergedList = node;
                list1 = list1.next;
            }

            else{
                var node = new ListNode(list2.val);
                mergedList.next = node;
                mergedList = node;
                list2 = list2.next;
            }

        }

        if(list1.next!=null) appendList(list2, mergedList);

        else if(list2.next!=null) appendList(list1, mergedList);

        return head.next;
    }


    // time o(1)
    public void appendList(ListNode list1, ListNode list2){
        list2.next = list1;
    }

    public static void main(String[] args){

        var list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(4);

        var list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(4);

        new MergeTwoSortedLists().mergeTwoLists(list1, list2);
    }


}
