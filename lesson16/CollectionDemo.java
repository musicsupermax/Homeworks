package lesson16;

import lesson8.ex5.Cat;

import java.util.ArrayList;
import java.util.List;

public class CollectionDemo {
    public static void main(String[] args) {
        List<Cat> arrayList = new ArrayList<>();
        arrayList.add(new Cat("beef", "Ukraine", 25.5));
        arrayList.add(new Cat("corn", "USA", 15));
        Cat cat = new Cat("pepper", "Mexico", 44);
        arrayList.add(cat);

        System.out.println("Collection size: " + arrayList.size());
        System.out.println(arrayList);
        System.out.println();
        enumerateCollection(arrayList);

        System.out.println();
        changeElement(arrayList);
        enumerateCollection(arrayList);
        System.out.println();

        arrayList.remove(arrayList.size() - 1);
        System.out.println("Collection size: " + arrayList.size());
        enumerateCollection(arrayList);
        System.out.println();

        receiveObjectArray(arrayList);
        System.out.println();
        receiveCatArray1(arrayList);
        System.out.println();
        receiveCatArray2(arrayList);
        System.out.println();

        arrayList.clear();
        System.out.println("Collection size: " + arrayList.size());
    }

    public static void receiveCatArray2(List<Cat> arrayList) {
        Cat[] cats = arrayList.toArray(new Cat[0]);
        for (Cat elements : cats) {
            System.out.println("Element: " + elements.getJumpUpLength());
        }
    }

    public static void receiveCatArray1(List<Cat> arrayList) {
        Cat[] cats = new Cat[arrayList.size()];
        arrayList.toArray(cats);
        for (Cat element : cats) {
            System.out.println("Element: " + element.getFood());
        }
    }

    public static void receiveObjectArray(List<Cat> arrayList) {
        Object[] array = arrayList.toArray();
        for (Object object : array) {
            System.out.println("Element: " + ((Cat) object).getLocation());
        }
    }

    public static void changeElement(List<Cat> arrayList) {
        Cat cat1 = arrayList.get(1);
        cat1.setFood("apple");
        arrayList.set(1, cat1);
    }

    public static void enumerateCollection(List<Cat> arrayList) {
        for (Cat cats : arrayList) {
            System.out.println("Element: " + cats);
        }
    }
}
