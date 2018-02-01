package lesson8.com.company.vehicles;

import lesson8.com.company.details.Engine;
import lesson8.com.company.professions.Driver;

public class CarDemo {
    public static void main(String[] args) {
        Driver cabDriver = new Driver(45, "Futs Pont");
        cabDriver.setExperience(12);
        Engine engine = new Engine(250, "Nissan");
        engine.setPower(350);

        Car bmw = new Car("Z4", "M", 2500, cabDriver, engine);
        bmw.printInfo();
        bmw.turnRight();
        bmw.start();

        SportCar lotus = new SportCar("Lotus", "S", 2200,
                cabDriver, engine, 360);
        System.out.println(lotus);
    }
}
