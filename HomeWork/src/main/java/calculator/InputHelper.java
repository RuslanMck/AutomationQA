package calculator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InputHelper {

    private String expression;
    private Pattern pattern;
    private Matcher matcher;

    public InputHelper(String expression) {
        this.expression = expression;
        //используем регулярное выражение
        pattern = Pattern.compile("^\\d+\\s*[+-]\\s*\\d+$");
        matcher = pattern.matcher(expression);
        if(!isStringCorrect()){
            throw new RuntimeException("String is not correct");
        }
    }

    public int getFirstArgument() {
        pattern = Pattern.compile("^(\\d+)");
        matcher = pattern.matcher(expression);
        matcher.find(); // matcher.find() обязательно нужен, перед тем, как дажавать matcher.group()
        return Integer.parseInt(matcher.group());
    }


    public int getSecondArgument() {
        pattern = Pattern.compile("(\\d+)$");
        matcher = pattern.matcher(expression);
        matcher.find();
        return Integer.parseInt(matcher.group());
    }

    public char getOperation() {
        pattern = Pattern.compile("([+-])");
        matcher = pattern.matcher(expression);
        matcher.find();
        return matcher.group().charAt(0);
    }

    private boolean isStringCorrect(){
        return matcher.matches();
    }
}
