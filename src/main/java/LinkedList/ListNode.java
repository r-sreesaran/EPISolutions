package LinkedList;


import java.util.HashSet;
import java.util.Set;

public class ListNode<T> {

    public T data;
    public ListNode<T> next;

    /**
     * List operations
     * IsEmpty
     * IsLast
     * Insert
     * Delete
     * Header
     *  Position First
     *  Posititon Adavance
     *  Position Header
     *  position Find
     *  position FindPrevious
     *
     * @param data
     * @param next
     */


    public  ListNode(T data, ListNode<T> next) {
           this.data = data;
           this.next = next;
    }

    @Override
    public String toString() {
        StringBuffer result = new StringBuffer();
        Set<ListNode<T>> visited = new HashSet<>();
        ListNode<T> iter = this;
        while(iter!=null) {
            if(visited.contains(iter)) {
                result.append(" End");
                break;
            }
            visited.add(iter);
            result.append(iter.data.toString()+(iter.next != null?"->":""));
            if(iter.next!=null) {
               iter = iter.next;
            }
        }
        return result.toString();
    }

    public static int countNodes(ListNode<Integer> mergerdNodes) {
        int i=1;
        ListNode<Integer> temp = null;
        while(mergerdNodes.next!=null) {
            i++;
            temp =  mergerdNodes.next;
            mergerdNodes = temp;
        }
        return i;
    }


}
