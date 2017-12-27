package lesson7;

public class Phone {
    String number;
    String model;
    double weight;
    String name;

    void receiveCall() {
        System.out.println("Звонит " + name);
    }

    String getNumber() {
        return number;
    }
}
