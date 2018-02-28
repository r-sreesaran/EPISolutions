package LinkedList;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestLinkedList {


    @Test(priority = 0)
    public void checkNodeIsAdded() {
        ListNode<Integer> ll3 = new ListNode<Integer>(3,null);
        ListNode<Integer> ll2 = new ListNode<Integer>(2,ll3);
        ListNode<Integer> ll1 = new ListNode<Integer>(1,ll2);

        Assert.assertEquals(ll1.toString(),"1->2->3 End");
    }

  /*  @Test(priority = 1)
    public void mergeTwoNodes() {
        ListNode<Integer> ll3 = new ListNode<Integer>(6,null);
        ListNode<Integer> ll2 = new ListNode<Integer>(3,ll3);
        ListNode<Integer> ll1 = new ListNode<Integer>(1,ll2);

        ListNode<Integer> ll6 = new ListNode<Integer>(11,null);
        ListNode<Integer> ll5 = new ListNode<Integer>(9,ll6);
        ListNode<Integer> ll4 = new ListNode<Integer>(8,ll5);

        MergeOrderedList mergeOperations = new MergeOrderedList();
        ListNode<Integer> mergerdNodes = MergeOrderedList.mergeList(ll1,ll4);

        ListNode<Integer> temp = null;

        Assert.assertEquals(6,ListNode.countNodes(mergerdNodes));
    }

    @Test(priority = 2)
    public void deleteKthNode() {
        ListNode<Integer> ll5 = new ListNode<Integer>(5,null);
        ListNode<Integer> ll4 = new ListNode<Integer>(4,ll5);
        ListNode<Integer> ll3 = new ListNode<Integer>(3,ll4);
        ListNode<Integer> ll2 = new ListNode<Integer>(2,ll3);
        ListNode<Integer> ll1 = new ListNode<Integer>(1,ll2);


        Assert.assertEquals(ListNode.countNodes(ListNode.deleteKthNode(ll1,2)),4);
        Assert.assertEquals("3",ll1.next.data.toString());
    }*/

}
