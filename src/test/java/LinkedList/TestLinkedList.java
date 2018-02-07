package LinkedList;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestLinkedList {

    @Test
    public void checkNodeIsAdded() {
        ListNode<Integer> ll3 = new ListNode<Integer>(3,null);
        ListNode<Integer> ll2 = new ListNode<Integer>(2,ll3);
        ListNode<Integer> ll1 = new ListNode<Integer>(1,ll2);

        Assert.assertEquals(ll1.toString(),"1->2->3 End");
    }

}
