import java.util.List;

public class Magazine implements Printable {

    private String name;

    @Override
    public void print() {
        System.out.println(name);
    }

    Magazine(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Magazine{" + "name='" + name + '\'' + '}';
    }

    public static void printMagazine(List<Printable> printable) {

        for (Printable p : printable) {
            if (p instanceof Magazine) {
                System.out.print("This is magazine: ");
                p.print();
            }
        }
    }
}
