public class Main {
    public static void main(String[] args) {
        Storekeeper storekeeper = new Storekeeper();
        ToyFactory toyFactory = new ToyFactory();
        ToyMarket toyMarket = new ToyMarket(storekeeper);
        Customer customer = new Customer(toyMarket);

        storekeeper.orderToys(toyFactory);


        /*
        * Customer can buy (.but(String "toy name")) a toy or see all available toys (.seeAllToys())
        * */
//        customer.seeAllToys();
        customer.buy("Molly");
    }
}
