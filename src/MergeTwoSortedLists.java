class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

//worst case time, n.
public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        var head = new ListNode();
        var mergedList = head;

        while(true){
            if(list1 ==null && list2==null){
                break;
            }

            else if(list1 ==null){
                appendList(list2, mergedList);
                break;
            }

            else if(list2==null){
                appendList(list1, mergedList);
                break;
            }

            else if(list1.val < list2.val){
                var node = new ListNode(list1.val);
                mergedList.next = node;
                mergedList = node;
                list1 = list1.next;

            }

            else if(list1.val > list2.val){
                var node = new ListNode(list2.val);
                mergedList.next = node;
                mergedList = node;
                list2 = list2.next;

            }

            else{
                var node1 = new ListNode(list1.val);
                var node2 = new ListNode(list1.val);

                mergedList.next=node1;
                mergedList.next.next=node2;
                mergedList = node2;

                list1 = list1.next;
                list2 = list2.next;
            }

        }

        return head.next;
    }


    // time o(1)
    public ListNode appendList(ListNode list1, ListNode list2){
        return list2.next=list1;
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
