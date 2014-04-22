/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package queue;

/**
 *
 * @author Amalia
 */
public class QueueLinkedList<T> implements Queue<T> {
    
    private int total;
    
    private Node first, last;
    
    private class Node {
        private T ele;
        private Node next;
    }
    
    public QueueLinkedList() { }
    
    @Override
    public QueueLinkedList<T> enqueue(T ele) {
        Node current = last;
        last = new Node();
        last.ele = ele;
        
        if (0 == total++) first = last;
        else current.next = last;
        
        return this;
    }

    @Override
    public T dequeue() {
        if (0 == total) throw new java.util.NoSuchElementException();
        T ele = first.ele;
        first = first.next;
        if (0 == --total) last = null;
        return ele;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node tmp = first;
        while(null != tmp) {
            sb.append(tmp.ele).append(", ");
            tmp = tmp.next;
        }
        return sb.toString();
    }
}