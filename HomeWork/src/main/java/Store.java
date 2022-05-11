import java.util.ArrayList;

public class Store {

    private ArrayList<Toy> toyStock;

    Store(){
        initStore();
    }

    private void initStore(){
         toyStock = new ArrayList<>();
    }

    public ArrayList<Toy> getToyStock() {
        return toyStock;
    }
}
