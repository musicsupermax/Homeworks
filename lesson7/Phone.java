package lesson7;

public class Phone {
    String number;
    String model;
    double weight;

    public Phone(String number, String model, double weight) {
        this(number, model);
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {
    }

    void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    void receiveCall(String name, String number) {
        System.out.println("Звонит " + name + " " + number);
    }

    String getNumber() {
        return number;
    }

    void sendMessage(String... numbers) {
        for (String number : numbers) {
            System.out.println("Отправлено смс номеру " + number);
        }
    }
}
