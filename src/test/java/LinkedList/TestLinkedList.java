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

    @Test
    public void mergeTwoNodes() {
        ListNode<Integer> ll3 = new ListNode<Integer>(6,null);
        ListNode<Integer> ll2 = new ListNode<Integer>(3,ll3);
        ListNode<Integer> ll1 = new ListNode<Integer>(1,ll2);

        ListNode<Integer> ll6 = new ListNode<Integer>(11,null);
        ListNode<Integer> ll5 = new ListNode<Integer>(9,ll6);
        ListNode<Integer> ll4 = new ListNode<Integer>(8,ll5);

        MergeOrderedList mergeOperations = new MergeOrderedList();
        ListNode<Integer> mergerdNodes = MergeOrderedList.mergeList(ll3,ll6);

        while(mergerdNodes.next!=null) {

        }
    }

}
