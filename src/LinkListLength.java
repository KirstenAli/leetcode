public class LinkListLength {

    public static int linkListLength(ListNode node){
        var head = node;

        var count =1;

        while(head.next!=null) {
            head = head.next;
            count++;
        }

        return count;
    }
}
