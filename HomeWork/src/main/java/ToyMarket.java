public class ToyMarket {

    private Storekeeper storekeeper;

    ToyMarket(Storekeeper storekeeper) {
        this.storekeeper = storekeeper;
    }

    public void searchForToy(String toyName) {
        storekeeper.searchForToy(toyName);
    }

    public void buyToy(String toyName) {
        BuyingSystem buyingSystem = new BuyingSystem(storekeeper);
        buyingSystem.buy(toyName);
    }

    public void showAllToys() {
        storekeeper.printStock();
    }
}
