package LinkedList;

import java.util.List;

//https://github.com/epibook/epibook.github.io/blob/9e3b362cff3840868f81262a9772e11a3d25a605/solutions/java/ReverseLinkedListFromSToF.java

public class ReverseSubList {

    public ListNode<Integer> reverseSubList(ListNode<Integer> L, int start, int finish) {

        ListNode<Integer> dummyHead = new ListNode<>(0, L);
        ListNode<Integer> sublistHead = dummyHead;
        int k = 1;
        while (k++ < start) {
            sublistHead = sublistHead.next;
        }

        // Reverse sublist.
        ListNode<Integer> sublistIter = sublistHead.next;
        while (start++ < finish) {
            ListNode<Integer> temp = sublistIter.next;
            sublistIter.next = temp.next;
            temp.next = sublistHead.next;
            sublistHead.next = temp;
        }
        return dummyHead.next;
    }
}
