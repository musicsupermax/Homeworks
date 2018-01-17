package lesson8.Ex4;

public class Flower {
    private String country;
    private int shelfLife;
    private double price;
    public static int count = 0;

    public Flower(String country, int shelfLife, double price) {
        this.country = country;
        this.shelfLife = shelfLife;
        this.price = price;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getShelfLife() {
        return shelfLife;
    }

    public void setShelfLife(int shelfLife) {
        this.shelfLife = shelfLife;
    }

    public double getPrice() {
        count++;
        return price;
    }

    public static int getCount() {
        return count;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
