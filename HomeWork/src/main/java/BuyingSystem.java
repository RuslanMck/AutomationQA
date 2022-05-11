public class BuyingSystem {

    private Storekeeper storekeeper;
    private final ConsoleReader consoleReader = new ConsoleReader();

    BuyingSystem(Storekeeper storekeeper) {
        this.storekeeper = storekeeper;
    }

    private boolean searchForToy(String toyName) {
        return storekeeper.searchForToy(toyName);
    }

    public void buy(String toyName) {
        if (searchForToy(toyName) && consoleReader.confirmation(toyName)) {
            System.out.println("You successfully bought " + toyName);
            System.out.println("Have a nice day.");
        }

    }
}
