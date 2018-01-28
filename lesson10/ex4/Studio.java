package lesson10.ex4;

public class Studio {
    private String name;

    public Studio(String name) {
        this.name = name;
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

        Studio studio = (Studio) o;

        return name != null ? name.equals(studio.name) : studio.name == null;
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Studio{" +
                "name='" + name + '\'' +
                '}';
    }

    public static void dressMen(Clothing[] clothing) {
        for (Clothing clothing1 : clothing) {
            if (clothing1 instanceof MensCloth) {
                System.out.println(clothing1);
            }
        }
    }

    public static void dressWom(Clothing[] clothing) {
        for (Clothing clothing1 : clothing) {
            if (clothing1 instanceof WomensCloth) {
                System.out.println(clothing1);
            }
        }
    }
}
