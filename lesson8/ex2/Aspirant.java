package lesson8.ex2;

public class Aspirant extends Student {
    private String work;

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

    @Override
    public String toString() {
        return "Aspirant{" +
                "work='" + work + '\'' +
                "} " + super.toString();
    }
}
