package lesson14.ex5;

public class FoodDemo {
    public static void main(String[] args) {
        Food food = new Food();
        food.prepare(new Cookable() {
            @Override
            public void cook() {
                System.out.println("Boiled shrimps");
            }
        });
    }
}
