package lesson9;

import lesson9.ex6.Modifiers;

public class ModifiersInheritor extends Modifiers {
    public ModifiersInheritor() {
    }

    public ModifiersInheritor(String password, double price, String name, int userId) {
        super(password, price, name, userId);
    }

    public static void main(String[] args) {
        ModifiersInheritor mi = new ModifiersInheritor();
        mi.name = "Tudor";
        mi.userId = 5;
        /*Access to variables "password" and "price" are closed because they have
        private and default modifiers*/
    }
}
