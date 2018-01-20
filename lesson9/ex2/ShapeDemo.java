package lesson9.ex2;

public class ShapeDemo {
    public static void main(String[] args) {
        Shape[] figure = new Shape[2];
        figure[0] = new Circle("Red", 45, 23);
        figure[1] = new Rectangle("Yellow", 86, 34);

        System.out.println(figure[0].equals(figure[1]));
        System.out.println();

        for (Shape figures : figure) {
            figures.draw();
            System.out.println();
            System.out.println(figures);
        }
    }
}
