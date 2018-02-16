package lesson16.ex5;

import java.util.Objects;
import java.util.SortedSet;

public class Category {
    private String name;
    private SortedSet<Commodity> commodities;

    public Category(String name, SortedSet<Commodity> commodities) {
        this.name = name;
        this.commodities = commodities;
    }

    public Category() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SortedSet<Commodity> getCommodities() {
        return commodities;
    }

    public void setCommodities(SortedSet<Commodity> commodities) {
        this.commodities = commodities;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Category category = (Category) o;
        return Objects.equals(name, category.name) &&
                Objects.equals(commodities, category.commodities);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, commodities);
    }

    @Override
    public String toString() {
        return "Category{" +
                "name='" + name + '\'' +
                ", commodities=" + commodities +
                '}';
    }
}
