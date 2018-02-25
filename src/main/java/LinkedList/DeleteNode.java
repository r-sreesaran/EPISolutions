package LinkedList;

public class DeleteNode {

    //This cannot be applied to tail nodes
    public static ListNode delete(ListNode node) {
        node.data = node.next.data;
        node.next = node.next.next;
        return node;
    }


}
