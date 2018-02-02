package LinkedList;

import java.util.List;

public class MergeOrderedList {

    public static ListNode<Integer> mergeList(ListNode<Integer> L1,ListNode<Integer> L2) {

ListNode<Integer> intial = new ListNode<>(0,null);
ListNode<Integer> current = intial;
        ListNode<Integer> p1=L1, p2=L2;

while(p1==null && p2==null) {
    if(p1.data<= p2.data) {
        current.next =p2;
        p1=p1.next;

    }
    else  {
        current.next = p2;
        p2 = p2.next;
    }
    current = current.next;
}

// Appends the remaining nodes of p1 or p2.
        current.next = p1 != null ? p1 : p2;
        return intial.next;
    }
}
