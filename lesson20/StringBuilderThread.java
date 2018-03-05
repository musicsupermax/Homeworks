package lesson20;

public class StringBuilderThread extends Thread {
    private StringBuilder stringBuilder;

    public StringBuilderThread(StringBuilder stringBuilder) {
        this.stringBuilder = stringBuilder;
    }

    @Override
    public void run() {
        synchronized (stringBuilder) {
            for (int i = 1; i < 101; i++) {
                System.out.println(stringBuilder + " " + i);
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                }
            }
            char symbol = stringBuilder.charAt(0);
            stringBuilder.setCharAt(0, ++symbol);
        }
    }
}
