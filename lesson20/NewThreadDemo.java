package lesson20;

public class NewThreadDemo {
    public static void main(String[] args) {
        Thread thread1 = new NewThread();
        Thread thread2 = new NewThread();
        Thread thread3 = new NewThread();

        thread1.setName("First thread");
        thread1.start();
        thread2.setName("Second thread");
        thread2.start();
        thread3.setName("Third thread");
        thread3.start();
    }
}
