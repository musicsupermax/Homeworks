package lesson16.ex5;

import java.util.Comparator;

public class CommodityComparatorName implements Comparator<Commodity> {
    @Override
    public int compare(Commodity o1, Commodity o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
