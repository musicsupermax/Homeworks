package lesson8.com.company.professions;

public class Driver extends Person {
    private String fullName;
    private double experience;

    public Driver(int age, String fullName, double experience) {
        super(age);
        this.fullName = fullName;
        this.experience = experience;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public double getExperience() {
        return experience;
    }

    public void setExperience(double experience) {
        this.experience = experience;
    }
}
