import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Printable> printableArrayList = BookShop.getLiterature();

        Book.printBook(printableArrayList);
        Magazine.printMagazine(printableArrayList);

    }
}
