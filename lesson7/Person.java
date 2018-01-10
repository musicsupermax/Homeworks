package lesson7;

public class Person {
    String fullName;
    int age;

    void move(String person) {
        System.out.println(person + " is talking");
    }

    void talk(String person) {
        System.out.println(person + " is talking");
    }

    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public Person() {
    }

    public static void main(String[] args) {
        Person webmaster = new Person("Anton Olegovich", 35);

        Person firefighter = new Person();
        firefighter.fullName = "Ashli Gudson";
        firefighter.age = 21;
    }
}
