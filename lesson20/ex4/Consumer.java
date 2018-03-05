package lesson20.ex4;

public class Consumer implements Runnable {
    private MyQueue myQueue;

    public Consumer(MyQueue myQueue) {
        this.myQueue = myQueue;
    }

    @Override
    public void run() {
        while(true) {
            myQueue.get();
        }
    }
}

