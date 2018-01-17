package lesson8.com.company.professions;

public class Driver {
    private String fullName;
    private double experience;

    public Driver(String fullName, double driveExp) {
        this.fullName = fullName;
        this.experience = driveExp;
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
