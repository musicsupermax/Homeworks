package lesson7;

public class PhoneDemo {
    public static void main(String[] args) {
        Phone myPhone = new Phone();

        myPhone.model = "HTC";
        myPhone.number = "0504821356";
        myPhone.weight = 0.354;

        System.out.println("Model: " + myPhone.model);
        System.out.println("Number: " + myPhone.number);
        System.out.println("Weight: " + myPhone.weight + "\n");

        myPhone.receiveCall("Mudi");
        System.out.println(myPhone.getNumber() + "\n");

        Phone myPhone1 = new Phone("2165498713", "HTC", 150.3);

        Phone myPhone2 = new Phone("5468976421", "IPhone");
        myPhone2.weight = 300;

        Phone myPhone3 = new Phone();
        myPhone3.number = "456421321";
        myPhone3.model = "ZTE";
        myPhone3.weight = 200.5;

        System.out.println(myPhone1.number + " " + myPhone1.model + " " + myPhone1.weight);
        System.out.println(myPhone2.number + " " + myPhone2.model + " " + myPhone2.weight);
        System.out.println(myPhone3.number + " " + myPhone3.model + " " + myPhone3.weight + "\n");

        myPhone.receiveCall("Ioan", "4568976789" + "\n");

        myPhone.sendMessage("8452321564", "4654698796413");
    }
}
