package lesson8.ex4;

public class FlowerDemo {
    public static void main(String[] args) {
        Flower[] bouquet1 = new Flower[3];
        bouquet1[0] = new Rose("Germany", 10, 20, "Red");
        bouquet1[1] = new Tulip("Netherlands", 6, 15, "Bomb");
        bouquet1[2] = new Violet("Ukraine", 100, 100, "mountains");

        price(bouquet1);

        Flower[] bouquet2 = new Flower[5];
        bouquet2[0] = new Tulip("Netherlands", 7, 20, "Wow");
        bouquet2[1] = new Tulip("Netherlands", 3, 50, "Gun");
        bouquet2[2] = new Rose("Gabon", 9, 30, "Red");
        bouquet2[3] = new Rose("France", 6, 70, "Blue");
        bouquet2[4] = new Tulip("Ukraine", 10, 12, "Hurt");

        price(bouquet2);

        Flower[] bouquet3 = new Flower[3];
        bouquet3[0] = new Violet("Switzerland", 320, 150, "Berry");
        bouquet3[1] = new Violet("Ukraine", 155, 75, "Sea");
        bouquet3[2] = new Violet("Italy", 133, 100, "Life");

        price(bouquet3);
        System.out.println("Количество проданных цветов: " + Flower.getCount());
    }

    static void price(Flower... ob) {
        double price = 0;
        for (Flower fl : ob) {
            price = price + fl.getPrice();
        }
        System.out.println("Стоимость букета: " + price);
    }
}
