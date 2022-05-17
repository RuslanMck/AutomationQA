package calculator;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InputHelper {

    private String expression;
    private Pattern pattern;
    private Matcher matcher;

    private ArrayList<Integer> results = new ArrayList<>();


    public InputHelper() {

    }

    public void readInput(String expression) {
        this.expression = expression;
        matchString();
        collectDigits();
        showDigits();
    }

    public void showDigits() {
        System.out.println("We found " + results.size() + " digits: ");
        for (int i : results) {
            System.out.print(i + "; ");
        }
        System.out.println();
    }

    private void matchString() {
        pattern = Pattern.compile("\\d+");
        matcher = pattern.matcher(expression);
    }

    private void collectDigits() {
        while (matcher.find()) {
            int i = Integer.parseInt(matcher.group());
            results.add(i);
        }
    }

    public ArrayList<Integer> getDigits() {
        return results;
    }

}
