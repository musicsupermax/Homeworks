package lesson8.Ex2;

public class Aspirant extends Student {
    String work;

    public Aspirant(String firstName, String lastName, String group, double averageMark, String work) {
        super(firstName, lastName, group, averageMark);
        this.work = work;
    }

    public int getScholarship() {
        if (getAverageMark() == 5) {
            return 200;
        }
        return 180;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

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
