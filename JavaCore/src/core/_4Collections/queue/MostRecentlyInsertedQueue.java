package core._4Collections.queue;


import java.util.AbstractQueue;
import java.util.Iterator;
import java.util.Queue;

public class MostRecentlyInsertedQueue<E> extends AbstractQueue<E> implements Queue<E> {

    private int size;
    private int capacity;
    private Node<E> head;
    private Node<E> tail;

    public MostRecentlyInsertedQueue(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public Iterator<E> iterator() {
        return new Iter();
    }

    @Override
    public int size() {
        return size;
    }

    /**
     * Inserts the specified element into this queue tail.
     *
     * @param e the element to add
     * @return {@code true}
     */
    @Override
    public boolean offer(E e) {
        if (size == capacity) {
            poll();
        }
        Node<E> last = tail;
        Node<E> newNode = new Node<>(last, e, null);
        tail = newNode;
        if (last == null) {
            head = newNode;
        } else {
            last.tail = newNode;
        }
        size++;
        return true;
    }

    /**
     * Retrieves and removes the head of this queue,
     * or returns {@code null} if this queue is empty.
     *
     * @return the head of this queue, or {@code null} if this queue is empty
     */
    @Override
    public E poll() {
        if (head == null) {
            return null;
        }
        E element = head.item;
        head = head.tail;
        size--;
        return element;
    }

    /**
     * Retrieves, but does not remove, the head of this queue,
     * or returns {@code null} if this queue is empty.
     *
     * @return the head of this queue, or {@code null} if this queue is empty
     */
    @Override
    public E peek() {
        return (head == null) ? null : head.item;
    }

    public E[] contents() {
        E[] array = (E[]) new Object[size];
        Iterator iterator = iterator();
        int i = 0;
        while (iterator.hasNext()) {
            array[i] = (E) iterator.next();
            i++;
        }

        return array;
    }

    public void clear() {
        size = 0;
        head = null;
        tail = null;
    }

    private static class Node<E> {
        E item;
        Node<E> head;
        Node<E> tail;

        Node(Node<E> head, E element, Node<E> tail) {
            this.item = element;
            this.head = head;
            this.tail = tail;
        }
    }

    private class Iter implements Iterator<E> {

        Node<E> next;

        Iter() {
            this.next = head;
        }

        @Override
        public boolean hasNext() {
            return next != null;
        }

        @Override
        public E next() {
            E item = next.item;
            next = next.tail;
            return item;
        }

    }
}
