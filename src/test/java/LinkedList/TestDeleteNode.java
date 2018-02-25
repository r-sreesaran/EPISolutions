package LinkedList;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestDeleteNode {

    @Test
    public void TestDeletion() {

        ListNode node3 = new ListNode(3, null);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(1, node2);

        ListNode deletednode = DeleteNode.delete(node1);
        Assert.assertEquals(2, ListNode.countNodes(deletednode));
    }
}

