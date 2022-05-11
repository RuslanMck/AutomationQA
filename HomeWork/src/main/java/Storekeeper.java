import java.util.ArrayList;

public class Storekeeper {


    private ArrayList<Toy> toyStock;

    public boolean searchForToy(String name) {
        for (Toy toy1 : toyStock) {
            if (toy1.getName() == name) {
                System.out.println("We found the toy " + toy1.getName());
                return true;
            }
        }
        System.out.println("Unfortunately we don't have a " + name + " right now.");
        return false;
    }

    public void orderToys(ToyFactory toyFactory) {
        toyStock = toyFactory.createToys();
    }

    public void printStock() {
        for (Toy toy : toyStock) {
            System.out.println(toy.getType() + ": name " + toy.getName() + ", price " + toy.getPrice() + "$;");
        }
    }
}
