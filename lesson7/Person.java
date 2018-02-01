package lesson7;

public class Person {
    private String fullName;
    private int age;

    public Person() {
    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("Person {fullName= '%s', age= '%d'}",
                fullName, age);
    }

    void move() {
        System.out.println(fullName + " is talking");
    }

    void talk() {
        System.out.println(fullName + " is talking");
    }

    public static void main(String[] args) {
        Person webmaster = new Person("Anton Olegovich", 35);

        Person firefighter = new Person();
        firefighter.fullName = "Ashli Gudson";
        firefighter.age = 21;

        webmaster.move();
        firefighter.talk();
        System.out.println(webmaster);
        System.out.println(firefighter);
    }
}
