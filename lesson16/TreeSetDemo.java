package lesson16;

import lesson8.ex2.Student;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        Set<Student> set = new TreeSet<>();
        set.add(new Student("Harry", "Andrushenko",
                "FV-25", 2));
        set.add(new Student("Doby", "Honcharenko",
                "TS-17", 3));
        set.add(new Student("Lisa", "Simpson",
                "NS-34", 4));
        set.add(new Student("Burt", "Simpson",
                "RD-48", 2));

        for (Student student: set){
            System.out.println(student);
        }
    }
}
