package LinkedList;

public class TestLinkedList {

    public static void main(String[] args) {
        ListNode<Integer> ll3 = new ListNode<Integer>(3,null);
        ListNode<Integer> ll2 = new ListNode<Integer>(2,ll3);
        ListNode<Integer> ll1 = new ListNode<Integer>(1,ll2);

        System.out.println(ll1.toString());

    }
}
