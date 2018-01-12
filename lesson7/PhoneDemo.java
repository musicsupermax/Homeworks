package lesson7;

public class PhoneDemo {
    public static void main(String[] args) {
        Phone myPhone = new Phone();

        myPhone.setModel("HTC");
        myPhone.setNumber("0504821356");
        myPhone.setWeight(0.354);

        System.out.println("Model: " + myPhone.getModel());
        System.out.println("Number: " + myPhone.getNumber());
        System.out.println("Weight: " + myPhone.getWeight() + "\n");

        myPhone.receiveCall("Mudi");
        System.out.println(myPhone.getNumber() + "\n");

        Phone myPhone1 = new Phone("2165498713", "HTC", 150.3);

        Phone myPhone2 = new Phone("5468976421", "IPhone");
        myPhone2.setWeight(300);

        Phone myPhone3 = new Phone();
        myPhone3.setNumber("456421321");
        myPhone3.setModel("ZTE");
        myPhone3.setWeight(200.5);

        System.out.println(myPhone1.getNumber() + " " + myPhone1.getModel() + " " + myPhone1.getWeight());
        System.out.println(myPhone2.getNumber() + " " + myPhone2.getModel() + " " + myPhone2.getWeight());
        System.out.println(myPhone3.getNumber() + " " + myPhone3.getModel() + " " + myPhone3.getWeight() + "\n");

        myPhone.receiveCall("Ioan", "4568976789" + "\n");

        myPhone.sendMessage("8452321564", "4654698796413");
    }
}
