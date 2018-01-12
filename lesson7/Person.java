package lesson7;

public class Person {
    String fullName;
    int age;

    public Person() {
    }

    void move() {
        System.out.println(fullName + " is talking");
    }

    void talk() {
        System.out.println(fullName + " is talking");
    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public static void main(String[] args) {
        Person webmaster = new Person("Anton Olegovich", 35);

        Person firefighter = new Person();
        firefighter.fullName = "Ashli Gudson";
        firefighter.age = 21;

        webmaster.move();
        firefighter.talk();
    }
}
