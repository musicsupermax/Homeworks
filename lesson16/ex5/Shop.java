package lesson16.ex5;

import java.util.Comparator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class Shop {
    public static void main(String[] args) {
        SortedSet<Commodity> commodities1 = new TreeSet<>();
        commodities1.add(new Commodity("Skirt", 45.53, 5));
        commodities1.add(new Commodity("T-short", 25.24, 4));
        commodities1.add(new Commodity("Sweater", 62.78, 3));
        commodities1.add(new Commodity("Tie", 20.96, 3));

        Set<Commodity> commodities2 = new TreeSet<>(new CommodityComparatorPrice());
        commodities2.addAll(commodities1);

        Set<Commodity> commodities3 = new TreeSet<>(new Comparator<Commodity>() {
            @Override
            public int compare(Commodity o1, Commodity o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        commodities3.addAll(commodities1);

        print(commodities1);
        print(commodities2);
        print(commodities3);

        Category category = new Category("Clothes", commodities1);
        print(category, new CommodityComparatorName());
        print(category, new CommodityComparatorPrice());
        print(category, category.getCommodities().comparator());
    }

    public static void print(Set<Commodity> commodities) {
        for (Commodity commodity : commodities) {
            System.out.println(commodity);
        }
        System.out.println();
    }

    public static void print(Category category, Comparator<? super Commodity> comparator) {
        SortedSet<Commodity> set = new TreeSet<>(comparator);
        set.addAll(category.getCommodities());
        print(set);
    }
}

