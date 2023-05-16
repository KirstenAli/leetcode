public class SwappingNodesLinkedListEasy {


    public ListNode swapNodes(ListNode head, int k) {
        var listLength = linkListLength(head);
        var secondPos = (listLength-k)+1;
        var node = head;
        ListNode firstNode = head;
        ListNode secondNode=head.next;

        var count = Math.max(secondPos, k);

        for (int i = 1; i <= count; i++) {
            if (i == k) {
                firstNode = node;
            }

            if (i == secondPos) {
                secondNode = node;
            }

            node = node.next;
        }


        var temp = firstNode.val;

        firstNode.val = secondNode.val;
        secondNode.val = temp;

        return head;
    }


    public int linkListLength(ListNode node){
        var head = node;

        var count =1;

        while(head.next!=null) {
            head = head.next;
            count++;
        }

        return count;
    }
}
