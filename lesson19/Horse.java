package lesson19;

import java.io.Serializable;

public class Horse extends Animal implements Serializable {
    private Halter halter;
    private String name;

    public Horse() {
    }

    public Horse(Halter halter) {
        this.halter = halter;
    }

    public Horse(Halter halter, String name) {
        this.halter = halter;
        this.name = name;
    }

    public Horse(String location, Halter halter, String name) {
        super(location);
        this.halter = halter;
        this.name = name;
    }

    public Halter getHalter() {
        return halter;
    }

    public void setHalter(Halter halter) {
        this.halter = halter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Horse horse = (Horse) o;

        return (halter != null ? halter.equals(horse.halter) : horse.halter == null)
                && (name != null ? name.equals(horse.name) : horse.name == null);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (halter != null ? halter.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Horse{" +
                "halter=" + halter +
                ", name='" + name + '\'' +
                "} " + super.toString();
    }
}
