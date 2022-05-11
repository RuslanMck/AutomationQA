import java.util.Scanner;

public class ConsoleReader {


    public boolean confirmation(String toyName) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Would you like to buy " + toyName + "?");
        System.out.print("[Yes/No]: ");
        String input = scanner.nextLine();

        if (input.equalsIgnoreCase("yes")) {
            return true;
        }
        System.out.println("Have a nice day.");
        return false;
    }
}
