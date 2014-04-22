/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package queue;

/**
 *
 * @author Amalia
 */
interface Queue<T> {
    Queue<T> enqueue(T ele);
    T dequeue();
}
