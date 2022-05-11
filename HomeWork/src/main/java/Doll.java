public class Doll extends Toy {

    String sex;
    String type = "Doll";


    public Doll(String name, int price, String sex) {
        super(name, price, "Doll");
        this.sex = sex;
    }
}
