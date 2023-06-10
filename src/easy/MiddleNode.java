package easy;

import easy.LinkListLength;
import easy.ListNode;

public class MiddleNode {
    public ListNode middleNode(ListNode head) {
        var length = LinkListLength.linkListLength(head);
        var mid = length/2;

        for (int i = 0; i < mid; i++) {
            head = head.next;
        }

        return head;
    }
}
