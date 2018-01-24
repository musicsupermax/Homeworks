package lesson10.ex4;

public class ClothesDemo {
    public static void main(String[] args) {
        Clothing tshirt = new Tshirt(Clothes.M, 75, "black", "Flowers");
        Clothing skirt = new Skirt(Clothes.S, 86, "Green", "Tulip");
        Clothing trousers = new Trousers(Clothes.L, 125, "Red", 38);
        Clothing tie = new Tie(Clothes.XS, 110, "Grey", "Viscose");

        Clothing[] clothing = {tshirt, skirt, trousers, tie};

        Studio.dressMen(clothing);
        System.out.println();
        Studio.dressWom(clothing);
    }
}
