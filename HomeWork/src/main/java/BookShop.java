import java.util.ArrayList;

public class BookShop {


    public static ArrayList<Printable> getLiterature() {

        ArrayList<Printable> list = new ArrayList<>();

        Book book1 = new Book("In Search of Lost Time by Marcel Proust");
        Book book2 = new Book("Ulysses by James Joyce");
        Book book3 = new Book("Don Quixote by Miguel de Cervantes");
        Book book4 = new Book("One Hundred Years of Solitude by Gabriel Garcia Marquez");

        Magazine magazine1 = new Magazine("Top ring");
        Magazine magazine2 = new Magazine("Sporting news");
        Magazine magazine3 = new Magazine("Golf Digest");

        list.add(book1);
        list.add(book2);
        list.add(book3);
        list.add(book4);
        list.add(magazine1);
        list.add(magazine2);
        list.add(magazine3);

        return list;
    }
}
