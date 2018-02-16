package lesson16;

import lesson8.ex2.Student;

import java.util.ArrayDeque;
import java.util.Deque;

public class QueueDemo {
    public static void main(String[] args) {
        Deque<Student> students = new ArrayDeque<>();

        students.offer(new Student("Hans", "Gibsy", "RT-75", 75));
        students.offer(new Student("Dorn", "Solt", "TP-98", 80));
        students.offer(new Student("Tim", "Polt", "MN-96", 60));
        students.offer(new Student("Tort", "Gerry", "IT-13", 95));

        while (!students.isEmpty()) {
            System.out.println(students.poll());
        }
    }
}
