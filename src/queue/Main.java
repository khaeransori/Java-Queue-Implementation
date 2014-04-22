/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package queue;

/**
 *
 * @author Amalia
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Queue<String> greeting = new QueueLinkedList<>();
        
        greeting.enqueue("Hello").enqueue(", ").enqueue("World!");
        
        System.out.println(greeting.dequeue() + greeting.dequeue() + greeting.dequeue());
    }
}
