package lesson16.ex8;

import java.util.*;

public class HashMapDemo {
    public static void main(String[] args) {
        Map<String, Toy> map = new HashMap<>();
        map.put("Car", new Toy("Car", 200));
        map.put("Jenga", new Toy("Jenga", 150));
        map.put("Monopoly", new Toy("Monopoly", 250));

        SortedMap<String, Toy> sortedMap = new TreeMap<>(map);

        printEntrySet(map);
        System.out.println();
        printKeys(map);
        System.out.println();
        printValues(map);
        printEntrySet(sortedMap);
        System.out.println();
        printKeys(sortedMap);
        System.out.println();
        printValues(sortedMap);
    }

    public static void printEntrySet(Map<String, Toy> map) {
        Set<Map.Entry<String, Toy>> set = map.entrySet();
        for (Map.Entry<String, Toy> me : set) {
            System.out.println(me.getKey() + " " + me.getValue());
        }
    }

    public static void printKeys(Map<String, Toy> map) {
        Set<String> keys = map.keySet();
        for (String key : keys) {
            System.out.println(key);
            System.out.println(map.get(key));
        }
    }

    public static void printValues(Map<String, Toy> map) {
        Collection<Toy> values = map.values();
        for (Toy value : values) {
            System.out.println(value);
        }
    }
}
