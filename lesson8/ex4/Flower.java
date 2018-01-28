package lesson8.ex4;

public class Flower {
    private String country;
    private int shelfLife;
    private double price;
    public static int count = 0;

    public Flower(String country, int shelfLife, double price) {
        this.country = country;
        this.shelfLife = shelfLife;
        this.price = price;
        count++;
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
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Flower flower = (Flower) o;

        return shelfLife == flower.shelfLife && Double.compare(flower.price, price) ==
                0 && (country != null ? country.equals(flower.country)
                : flower.country == null);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = country != null ? country.hashCode() : 0;
        result = 31 * result + shelfLife;
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Flower{" +
                "country='" + country + '\'' +
                ", shelfLife=" + shelfLife +
                ", price=" + price +
                '}';
    }

    public static int getCount() {
        return count;
    }

    static void price(Flower... ob) {
        double price = 0;
        for (Flower fl : ob) {
            price = price + fl.getPrice();
        }
        System.out.println("Стоимость букета: " + price);
    }
}
