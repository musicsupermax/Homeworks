package lesson15;

import lesson8.ex5.Animal;
import lesson8.ex5.Dog;

import java.io.Serializable;

public class GenericDemo<T extends Comparable, V extends Animal & Serializable,
        K extends Number> {
    private T obj1;
    private V obj2;
    private K obj3;

    public GenericDemo(T obj1, V obj2, K obj3) {
        this.obj1 = obj1;
        this.obj2 = obj2;
        this.obj3 = obj3;
    }

    public T getObj1() {
        return obj1;
    }

    public V getObj2() {
        return obj2;
    }

    public K getObj3() {
        return obj3;
    }

    public void setObj1(T obj1) {
        this.obj1 = obj1;
    }

    public void setObj2(V obj2) {
        this.obj2 = obj2;
    }

    public void setObj3(K obj3) {
        this.obj3 = obj3;
    }

    public void printClassName() {
        System.out.println("obj1: " + getObj1().getClass().getName());
        System.out.println("obj2: " + getObj2().getClass().getName());
        System.out.println("obj3: " + getObj3().getClass().getName());
    }

    public static void main(String[] args) {
        GenericDemo<String, Animal, Double> object1 = new GenericDemo<>("Topot",
                new Dog("Beef", "Africa", 30), 5.0);
        object1.printClassName();
    }
}
