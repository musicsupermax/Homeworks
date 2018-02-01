package lesson8.com.company.vehicles;

import lesson8.com.company.details.Engine;
import lesson8.com.company.professions.Driver;

public class Lorry extends Car {
    private int carrying;

    public Lorry(String model, String carClass, double weight, Driver driver, Engine engine, int carrying) {
        super(model, carClass, weight, driver, engine);
        this.carrying = carrying;
    }

    public int getCarrying() {
        return carrying;
    }

    public void setCarrying(int carrying) {
        this.carrying = carrying;
    }

    @Override
    public String toString() {
        return "Lorry{" +
                "carrying=" + carrying +
                "} " + super.toString();
    }
}
