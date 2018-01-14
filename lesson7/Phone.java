package lesson7;

public class Phone {
    private String number;
    private String model;
    private double weight;
    public static int count = 0;

    public Phone(String number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
        count++;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
        count++;
    }

    public Phone() {
        count++;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    static int getCountInstance() {
        return count;
    }

    public void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    public void receiveCall(String name, String number) {
        System.out.println("Звонит " + name + " " + number);
    }

    public void sendMessage(String... numbers) {
        for (String number : numbers) {
            System.out.println("Отправлено смс номеру " + number);
        }
    }

    protected void finalize() {
        System.out.println("In Finalize");
        count--;
    }
}