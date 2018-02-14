package LinkedList;

import org.testng.annotations.Test;

public class TestReverseLinkedList {

    @Test
    public void testReverseLinkedList() {
        ListNode<Integer> ll3 = new ListNode<Integer>(3,null);
        ListNode<Integer> ll2 = new ListNode<Integer>(2,ll3);
        ListNode<Integer> ll1 = new ListNode<Integer>(1,ll2);

        ReverseLinkedList operation = new ReverseLinkedList();

        System.out.println(operation.reverse(ll1));
    }
}
