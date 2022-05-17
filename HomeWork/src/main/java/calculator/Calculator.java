package calculator;

import java.util.ArrayList;


public class Calculator {

    private int result = 0;

    private final InputHelper inputHelper = new InputHelper();

    public Calculator() {

    }

    private int calculate(ArrayList<Integer> digits) {
        for (int i : digits) {
            result = result + i;
        }
        return result;
    }

    public int getSum(String input) {
        inputHelper.readInput(input);
        ArrayList<Integer> results = inputHelper.getDigits();
        return calculate(results);
    }
}
