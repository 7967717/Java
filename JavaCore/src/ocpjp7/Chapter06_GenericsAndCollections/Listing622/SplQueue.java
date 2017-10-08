package ocpjp7.Chapter06_GenericsAndCollections.Listing622;
/*ocpjp7*/


// This program shows the usage of Deque interface

import java.util.ArrayDeque;
import java.util.Deque;

class SplQueue {
    private Deque<String> splQ = new ArrayDeque<>();

    void addInQueue(String customer) {
        splQ.addLast(customer);
    }

    void removeFront() {
        splQ.removeFirst();
    }

    void removeBack() {
        splQ.removeLast();
    }

    void printQueue() {
        System.out.println("Special queue contains: " + splQ);
    }
}