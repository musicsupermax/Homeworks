package lesson8.ex2;

public class StudentDemo {
    public static void main(String[] args) {
        Student student = new Student("Fudy", "Strod", "KT-45", 5);
        Aspirant aspirant = new Aspirant("Son", "Kud", "PO-12", 5, "Aspirant's work");

        System.out.println(aspirant.getFirstName());
        System.out.println(aspirant.getLastName());
        System.out.println(aspirant.getGroup());
        System.out.println(aspirant.getAverageMark());
        System.out.println(aspirant.getWork() + "\n");

        Student aspirant1 = new Aspirant("Artur", "Kod", "TE-32", 4, "Good");
        System.out.println(aspirant1.getFirstName());
        System.out.println(aspirant1.getLastName());
        System.out.println(aspirant1.getGroup());
        System.out.println(aspirant1.getAverageMark() + "\n");

        Student[] students = {student, aspirant, aspirant1};
        for (Student stud : students) {
            System.out.println(stud.getScholarship());
        }
    }
}
