package lesson10.ex1;

public class Book implements Printable {
    private String name;

    public Book(String name) {
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

        Book book = (Book) o;

        return name != null ? name.equals(book.name) : book.name == null;
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public void print() {
        System.out.println("Вывожу на печать книгу " + getName());
    }

    public static void printBooks(Printable[] printables) {
        for (Printable printable : printables) {
            if (printable instanceof Book) {
                System.out.println("Book " + ((Book) printable).getName());
            }
        }
    }
}
