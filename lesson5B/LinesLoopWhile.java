package lesson5B;

public class LinesLoopWhile {
    public static void main(String[] args) {
        int line = 1;

        while (line > 0 && line <= 10) {
            System.out.println("Task" + line++);
        }
    }
}
