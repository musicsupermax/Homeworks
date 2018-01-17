package lesson8.com.company.professions;

public class Person extends Driver {
    private int age;

    public Person(String fullName, double driveExp, int age) {
        super(fullName, driveExp);
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
