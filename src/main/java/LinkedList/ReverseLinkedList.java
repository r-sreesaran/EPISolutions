package LinkedList;

import java.util.List;

public class ReverseLinkedList {

    public ListNode<Integer> reverse(ListNode<Integer> head) {

        if (head.next == null ) {
            return head;
        }

        ListNode<Integer> newHead = reverse(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }


}
