package calculator;

public class Calculator {

    private int a;
    private int b;
    private char operation;

    //"2+2" return 4
    //"4+5" return 9
    //"4 - 2" return 2
    public int calculate(String expression) {
        InputHelper inputHelper = new InputHelper(expression);
        a = inputHelper.getFirstArgument();
        b = inputHelper.getSecondArgument();
        operation = inputHelper.getOperation();
        if (operation == '+') {
            return a + b;
        } else {
            return a - b;
        }
    }
}
