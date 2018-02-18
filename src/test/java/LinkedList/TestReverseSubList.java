package LinkedList;


import org.testng.annotations.Test;

public class TestReverseSubList {

    @Test
     public void testReverseSubList() {

        ListNode<Integer> ll7 = new ListNode<Integer>(7, null);
        ListNode<Integer> ll6 = new ListNode<Integer>(6, ll7);
        ListNode<Integer> ll5 = new ListNode<Integer>(5, ll6);
        ListNode<Integer> ll4 = new ListNode<Integer>(4, ll5);
        ListNode<Integer> ll3 = new ListNode<Integer>(3, ll4);
        ListNode<Integer> ll2 = new ListNode<Integer>(2, ll3);
        ListNode<Integer> ll1 = new ListNode<Integer>(1, ll2);

        ReverseSubList operation = new ReverseSubList();

        System.out.println(operation.reverseSubList(ll1, 5, 7));
    }

        @Test
         public void test2() {

            ReverseSubList operation = new ReverseSubList();
            ListNode<Integer> L;
            L = new ListNode<>(1, new ListNode<>(2, new ListNode<>(3, null)));
            ListNode<Integer> result;
            result = operation.reverseSubList(L, 2, 3);
            assert(result.data.equals(1) && result.next.data.equals(3)
                    && result.next.next.data.equals(2) && result.next.next.next == null);

        }
    }









