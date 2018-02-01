package lesson8.com.company.professions;

public class Driver extends Person {
    private double experience;

    public Driver(int age, String fullName) {
        super(age, fullName);
    }

    public double getExperience() {
        return experience;
    }

    public void setExperience(double experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "experience=" + experience +
                "} " + super.toString();
    }
}
