package lesson20;

public class NewRunnableDemo {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new NewRunnable(), "First");
        Thread thread2 = new Thread(new NewRunnable(), "Second");
        Thread thread3 = new Thread(new NewRunnable(), "Third");

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
