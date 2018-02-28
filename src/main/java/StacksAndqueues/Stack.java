package StacksAndqueues;

import java.util.Deque;
import java.util.LinkedList;

public class Stack<T> {

    Deque<T> queue = new LinkedList<>();

    public void push(T t) {
        queue.push(t);
    }

    public T pop() {
       return queue.pop();
    }

    public T peek() {
        return queue.peek();
    }

    public int getSize() {
        return queue.size();
    }

}
