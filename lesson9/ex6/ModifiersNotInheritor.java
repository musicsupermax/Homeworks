package lesson9.ex6;

public class ModifiersNotInheritor {
    public static void main(String[] args) {
        Modifiers modifiers = new Modifiers();

        modifiers.name = "Gudzy";
        modifiers.price = 17.8;
        modifiers.userId = 3;
        /*Access to variable "password" is closed because it has
        private modifier*/
    }
}
