package lesson16;

import lesson8.ex2.Aspirant;
import lesson8.ex2.Student;


import java.util.Set;
import java.util.TreeSet;

public class Methods {
    public static void main(String[] args) {
        Set<Student> students = new TreeSet<>();
        students.add(new Student("Tip", "Artur",
                "PO-89", 65));
        students.add(new Student("Semi", "Lory",
                "AN-96", 84));

        Set<Aspirant> aspirants = new TreeSet<>();
        aspirants.add(new Aspirant("Rich", "Appi",
                "TR-12", 85, "Topus"));
        aspirants.add(new Aspirant("Toni", "Artur",
                "GS-35", 45, "Lans"));

        union(students, aspirants);
        intersect(students, aspirants);
    }

    public static void union(Set<?>... set) {
        Set<?> set1 = new TreeSet<>();
        for (Set element : set) {
            set1.addAll(element);
        }
        System.out.println(set1);
    }

    public static void intersect(Set<?>... set) {
        Set<?> set1 = new TreeSet<>();
        for (Set element: set){
            set1.retainAll(element);
        }
        System.out.println(set1);
    }
}
