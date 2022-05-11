public class Customer {

    private ToyMarket toyMarket;

    Customer(ToyMarket toyMarket) {
        this.toyMarket = toyMarket;
    }

    public void buy(String name) {
        toyMarket.buyToy(name);
    }

    public void seeAllToys() {
        toyMarket.showAllToys();
    }
}
