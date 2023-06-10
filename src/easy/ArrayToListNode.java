package easy;

public class ArrayToListNode {
    public static ListNode arrayToListNode(int[] a){

        ListNode currentNode = new ListNode(a[0]);
        var head = currentNode;

        for (int i=1; i<a.length; i++) {
            currentNode.next = new ListNode(a[i]);
            currentNode = currentNode.next;
        }

        return head;
    }
}
