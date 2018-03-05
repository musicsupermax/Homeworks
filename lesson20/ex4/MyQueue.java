package lesson20.ex4;

import java.util.ArrayDeque;
import java.util.Queue;

public class MyQueue<T> {
    private Queue<T> queue = new ArrayDeque<>();

    public synchronized Queue<T> get() {
        while (queue.isEmpty()) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Пoлyчeнo: " + queue);
        notify();
        return queue;
    }

    public synchronized void put(Queue<T> quantity) {
        /*while () {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }*/
        this.queue = quantity;
        System.out.println("Oтпpaвлeнo: " + quantity);
        notify();
    }
}
