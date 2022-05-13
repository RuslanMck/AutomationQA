import calculator.Calculator;

public class Main {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int result = calculator.calculate("4 + 2");
        System.out.println(result);
    }

}
