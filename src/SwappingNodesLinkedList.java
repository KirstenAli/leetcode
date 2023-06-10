public class SwappingNodesLinkedList {


    public ListNode swapNodes(ListNode head, int k) {
        var listLength = LinkListLength.linkListLength(head);
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

    public static void main(String[] args){
        var intArray = new int[]{100, 90};

        var list = ArrayToListNode.arrayToListNode(intArray);

        new SwappingNodesLinkedList().swapNodes(list, 2);

    }
}
