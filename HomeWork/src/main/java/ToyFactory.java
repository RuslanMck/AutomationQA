import java.util.ArrayList;

public class ToyFactory {

    public ArrayList<Toy> createToys() {
        ArrayList<Toy> toyOrder = new ArrayList<>();
        toyOrder.add(createDoll("Molly", 102, "Girl"));
        toyOrder.add(createDoll("Anna", 35, "Girl"));
        toyOrder.add(createDoll("Chloe", 250, "Girl"));
        toyOrder.add(createDoll("Eddy", 185, "Boy"));
        toyOrder.add(createDoll("Mark", 18, "Boy"));
        toyOrder.add(createDoll("Tonny", 87, "Boy"));
        toyOrder.add(createCar("TJ-754", 350, "Yellow"));
        toyOrder.add(createCar("RX-953", 254, "Blue"));
        toyOrder.add(createCar("PI-02", 187, "Red"));
        toyOrder.add(createCar("DR-112", 25, "White"));
        toyOrder.add(createCar("ZI-88", 105, "Black"));


        return toyOrder;
    }

    private Toy createDoll(String name, int price, String sex) {
        return new Doll(name, price, sex);
    }

    private Toy createCar(String name, int price, String color) {
        return new Car(name, price, color);
    }
}
