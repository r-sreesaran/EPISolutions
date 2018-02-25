package LinkedList;

import java.util.List;

//https://github.com/epibook/epibook.github.io/blob/master/solutions/java/CheckingCycle.java
public class FindCyclicity {

    public String checkCyclic(ListNode<Integer> list) {
        ListNode<Integer> slow = list;
        ListNode<Integer> fast = list;

        while(fast.next!= null | fast!=null) {
            if(slow ==fast) {
return "loop found";
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return "no Loops";
    }
}
