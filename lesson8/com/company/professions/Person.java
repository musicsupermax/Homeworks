package lesson8.com.company.professions;

public class Person {
    private int age;
    private String fullName;

    public Person(int age, String fullName) {
        this.age = age;
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @Override
    public String toString() {
        return String.format("Person {fullName= '%s', age= '%d'}",
                fullName, age);
    }
}
