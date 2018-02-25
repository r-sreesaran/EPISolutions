package LinkedList;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.internal.annotations.ExpectedExceptionsAnnotation;

public class TestFindCyclicity {

    ListNode<Integer> node1= null;


    @Test
    public void testLoops() {
        ListNode<Integer> node8 = new ListNode<>(4,null);
        ListNode<Integer> node7 = new ListNode<>(3,node8);
        ListNode<Integer> node6 = new ListNode<>(2,node7 );
        ListNode<Integer> node5  = new ListNode<>(1, node6);
node8.next= node5;

        FindCyclicity instance = new FindCyclicity();
        instance.checkCyclic(node5);
    }

    @Test
    public void testWithoutLoop() {
        ListNode<Integer> node8 = new ListNode<>(4,null);
        ListNode<Integer> node7 = new ListNode<>(3,node8);
        ListNode<Integer> node6 = new ListNode<>(2,node7 );
        ListNode<Integer> node5  = new ListNode<>(1, node6);

        FindCyclicity instance = new FindCyclicity();
     try{
         instance.checkCyclic(node5);
     }
     catch (NullPointerException e) {

     }

    }

}
