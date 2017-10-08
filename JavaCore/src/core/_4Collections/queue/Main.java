package core._4Collections.queue;

import java.util.Iterator;

/**
 * @author roman on 2/1/17.
 */
public class Main {
    public static void main(String[] args) {
        MostRecentlyInsertedQueue queue = new MostRecentlyInsertedQueue(3);
        System.out.println("size - " + queue.size());
        print(queue);
        queue.offer(1);
        System.out.println("size - " + queue.size());
        print(queue);
        queue.offer(2);
        System.out.println("size - " + queue.size());
        print(queue);
        queue.offer(3);
        System.out.println("size - " + queue.size());
        print(queue);
        queue.offer(4);
        System.out.println("size - " + queue.size());
        print(queue);
        queue.offer(5);
        System.out.println("size - " + queue.size());
        print(queue);
        System.out.println("------------------------");
        System.out.println("poll - " + queue.poll());
        System.out.println("size - " + queue.size());
        print(queue);
        System.out.println("poll - " + queue.poll());
        System.out.println("size - " + queue.size());
        print(queue);
        System.out.println("peek - " + queue.peek());
        System.out.println("size - " + queue.size());
        print(queue);
        System.out.println("------------------------");
        queue.clear();
        System.out.println("size - " + queue.size());
        print(queue);
    }

    private static void print(MostRecentlyInsertedQueue queue) {
        System.out.print("elems - ");
        for(Object o : queue.contents()) {
            System.out.print(o + " ");
        }
        System.out.println();
    }
}
