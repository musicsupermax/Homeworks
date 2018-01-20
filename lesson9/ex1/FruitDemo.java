package lesson9.ex1;

public class FruitDemo {
    public static void main(String[] args) {
        Fruit[] fruits = new Fruit[3];
        fruits[0] = new Apple(22, "Apple");
        fruits[1] = new Pear(35, "Pear");
        fruits[2] = new Apricot(28, "Apricot");

        fruits[0].setWeight(3);
        fruits[1].setWeight(6);
        fruits[2].setWeight(2);

        for (Fruit fruit : fruits) {
            System.out.println(fruit.getName() + " " + fruit.getPrice());
        }

        double total = 0;
        for (Fruit fruit : fruits) {
            total = total + fruit.getPrice();
        }
        System.out.println("Total price is " + total);
    }
}
