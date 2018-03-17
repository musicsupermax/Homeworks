package lesson13;

import lesson12.Employee;
import lesson7.Matrix;

import java.util.Arrays;

public class Metainformation {
    public static void main(String[] args) {
        printInfo(Employee.class);
        printInfo(float.class);
        printInfo(Matrix.class);
    }

    private static void printInfo(Class object) {
        System.out.println(object);
        System.out.println("Is interface? " + object.isInterface());
        System.out.println("Is local class? " + object.isLocalClass());
        System.out.println("Is enum? " + object.isEnum());
        System.out.println("Is primitive? " + object.isPrimitive());
        System.out.println("Package: " + object.getPackage());
        System.out.println("Declared constructors: "
                + Arrays.toString(object.getDeclaredConstructors()));
        System.out.println("Constructors: "
                + Arrays.toString(object.getConstructors()));
        System.out.println("Declared methods: "
                + Arrays.toString(object.getDeclaredMethods()));
        System.out.println("Methods: "
                + Arrays.toString(object.getDeclaredMethods()) + "\n");
    }
}
