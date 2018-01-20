package lesson8.ex5;

public class Vet {
    public static void main(String[] args) {
        Animal[] animals = new Animal[3];
        animals[0] = new Dog("Beef", "Australia", 12.5);
        animals[1] = new Cat("Fish", "Poland", 120);
        animals[2] = new Horse("Oat", "Croatia", 65);

        for (Animal animal : animals) {
            treatAnimal(animal);
        }
    }

    static void treatAnimal(Animal animal) {
        System.out.println("Food: " + animal.getFood());
        System.out.println("Location: " + animal.getLocation());
    }
}
