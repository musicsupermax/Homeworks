package lesson9.ex6;

public class ModifiersInheritor extends Modifiers {

    public ModifiersInheritor(String password, double price, String name, int userId) {
        super(password, price, name, userId);
    }

    public ModifiersInheritor() {
    }

    public static void main(String[] args) {
        ModifiersInheritor mi = new ModifiersInheritor();

        mi.name = "Karl";
        mi.price = 15.50;
        mi.userId = 4;
        /*Access to variable "password" is closed because it has
        private modifier*/
    }
}
