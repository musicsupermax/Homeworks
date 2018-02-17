package lesson16;

import lesson8.ex2.Student;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("Lippo", "Trump", "SK-78", 90));
        list.add(new Student("Gozzy", "But", "MN-44", 81));
        list.add(new Student("Sunny", "Evobi", "QW-12", 76));
        list.add(new Student("Rob", "Sink", "SK-44", 90));

        System.out.println(getBestMark(list));
        System.out.println();
        System.out.println(list);
    }

    public static List<Student> getBestMark(List<Student> list) {
        List<Student> result = new ArrayList<>();

        Iterator<Student> iterator = list.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getAverageMark() >= 90) {
                iterator.remove();
                result.add(student);
            }
        }
        return result;
    }
}
