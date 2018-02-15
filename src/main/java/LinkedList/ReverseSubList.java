package LinkedList;

import java.util.List;

public class ReverseSubList {

    public ListNode<Integer> reverseSubList(ListNode<Integer> L, int start, int finish) {

        ListNode<Integer> dummy =  new ListNode<>(0,L);
        ListNode<Integer> subList = dummy;
        int k = 1;
        while(k++<start) {
subList = subList.next;
        }

        ListNode<Integer> subListIter = dummy.next;

        while(k++ <finish) {
            ListNode<Integer> temp =  subListIter;
             subListIter.next = temp.next;
             temp.next = subListIter.next;
             subListIter.next = temp;


        }
return dummy.next;
    }
}
