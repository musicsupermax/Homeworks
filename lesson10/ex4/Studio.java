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
    public String toString() {
        return "Studio{" +
                "name='" + name + '\'' +
                '}';
    }

    public static void dressMen(Clothing[] clothing) {
        for (Clothing clothing1 : clothing) {
            if (clothing1 instanceof Tshirt || clothing1 instanceof Trousers
                    || clothing1 instanceof Tie) {
                System.out.println(clothing1);
            }
        }
    }

    public static void dressWom(Clothing[] clothing) {
        for (Clothing clothing1 : clothing) {
            if (clothing1 instanceof Tshirt || clothing1 instanceof Skirt || clothing1 instanceof Trousers) {
                System.out.println(clothing1);
            }
        }

    }
}
