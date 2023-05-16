
// more challenging: instead of simply swapping the node values, swap the nodes instead:

class ListWrapper{
    ListNode pre;
    ListNode target;

    ListNode next;

    public ListWrapper(ListNode pre,
                       ListNode target,
                       ListNode next) {
        this.pre = pre;
        this.target = target;
        this.next = next;
    }
}

public class SwappingNodesLinkedList {

    public ListNode swapNodes(ListNode head, int k) {
        var length = linkListLength(head);

        var firstWrapper = getWrapper(head, k);
        var firstPre = firstWrapper.pre;
        var firstTarget = firstWrapper.target;
        var firstNext = firstWrapper.next;

        var secondPos = (length - k) + 1;
        var secondWrapper = getWrapper(head, secondPos);
        var secondPre = secondWrapper.pre;
        var secondTarget = secondWrapper.target;
        var secondNext = secondWrapper.next;

        if (secondPos - k == -1) {
            secondPre.next = firstTarget;
            var temp = firstTarget.next;
            firstTarget.next = secondTarget;
            secondTarget.next = temp;
        }

        else {

            if (secondPos - k == 1) {
                secondTarget.next = firstTarget;
            } else {

                secondPre.next = firstTarget;
                secondTarget.next = firstNext;
            }
            firstPre.next = secondTarget;
            firstTarget.next = secondNext;
        }

        if(k==1)
            head=secondTarget;

        else if(k==length)
            head = firstTarget;


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

    public ListWrapper getWrapper(ListNode node, int targetPos){
        var count =1;
        var head = node;
        var preListNode= new ListNode();

        while(count !=targetPos){
            preListNode = head;
            head = head.next;
            count++;
        }

        return new ListWrapper(preListNode, head, head.next);
    }
}
