package lesson10.ex1;

public class Magazine implements Printable {
    private String article;

    public Magazine(String article) {
        this.article = article;
    }

    public String getArticle() {
        return article;
    }

    public void setArticle(String article) {
        this.article = article;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Magazine magazine = (Magazine) o;

        return article != null ? article.equals(magazine.article) : magazine.article == null;
    }

    @Override
    public int hashCode() {
        return article != null ? article.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "article='" + article + '\'' +
                '}';
    }

    @Override
    public void print() {
        System.out.println("Вывожу на печать статью " + getArticle());
    }

    public static void printMagazine(Printable[] printables) {
        for (Printable printable : printables) {
            if (printable instanceof Magazine)
                System.out.println("Article: " + ((Magazine) printable).getArticle());
        }
    }
}
