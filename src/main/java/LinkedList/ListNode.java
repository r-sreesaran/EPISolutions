package LinkedList;


import java.util.HashSet;
import java.util.Set;

public class ListNode<T> {

    public T data;
    public ListNode<T> next;

    public void ListNode(T data, ListNode<T> next) {
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
                result.append("Loop back to " +data.toString());
                break;
            }
            visited.add(iter);
            result.append(iter.data.toString()+(iter.next != null?"->":""));
        }
        return result.toString();
    }
}
