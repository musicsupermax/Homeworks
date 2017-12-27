package lesson7;

public class PhoneDemo {
    public static void main(String[] args) {
        Phone myPhone = new Phone();

        myPhone.model = "HTC";
        myPhone.number = "0504821356";
        myPhone.weight = 0.354;
        myPhone.name = "Nort";

        System.out.println("Model: " + myPhone.model);
        System.out.println("Number: " + myPhone.number);
        System.out.println("Weight: " + myPhone.weight);

        myPhone.receiveCall();
        System.out.println(myPhone.getNumber());
    }
}
