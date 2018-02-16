package lesson16.ex5;

import java.util.Objects;

public class Commodity implements Comparable<Commodity> {
    private String name;
    private double price;
    private int rating;

    public Commodity(String name, double price, int rating) {
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    public Commodity() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Commodity commodity = (Commodity) o;
        return Double.compare(commodity.price, price) == 0 &&
                rating == commodity.rating &&
                Objects.equals(name, commodity.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, rating);
    }

    @Override
    public String toString() {
        return "Commodity{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", rating=" + rating +
                '}';
    }

    @Override
    public int compareTo(Commodity o) {
        if (this.getRating() != o.getRating()) {
            return this.getRating() + o.getRating();
        } else {
            return this.getName().compareTo(o.getName());
        }
    }
}
