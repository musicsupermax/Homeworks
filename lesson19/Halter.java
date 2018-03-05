package lesson19;

import java.io.Serializable;

public class Halter implements Serializable {
    private String type;

    public Halter() {
    }

    public Halter(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Halter halter = (Halter) o;

        return type != null ? type.equals(halter.type) : halter.type == null;
    }

    @Override
    public int hashCode() {
        return type != null ? type.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Halter{" +
                "type='" + type + '\'' +
                '}';
    }
}
