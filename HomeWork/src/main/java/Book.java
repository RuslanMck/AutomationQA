import java.util.List;

public class Book implements Printable {

    private String name;

    Book(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println(name);
    }

    @Override
    public String toString() {
        return "Book{" + "name='" + name + '\'' + '}';
    }

    public static void printBook(List<Printable> printable) {
        for (Printable p : printable) {
            if (p instanceof Book) {
                System.out.print("This is book: ");
                p.print();
            }
        }
    }
}
