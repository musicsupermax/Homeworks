package lesson9;

import lesson9.ex6.Modifiers;

public class ModifiersNotInheritor {
    public static void main(String[] args) {
        Modifiers modifiers = new Modifiers();
        modifiers.userId = 6;
        /*Access to variables "password", "price" and "name" are closed because they have
        private, default and protected modifiers*/
    }
}
