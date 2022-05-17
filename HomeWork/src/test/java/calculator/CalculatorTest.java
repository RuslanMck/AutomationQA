package calculator;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    private final Calculator calculator = new Calculator();
    private final InputHelper inputHelper = new InputHelper();


    @Test
    public void testSum() {
        Assert.assertEquals(22, calculator.getSum("lmvm;v ;ls ;lsje 10l;k;df )(%U@10kmo 2"));
    }

    @Test
    public void getDigitsNotNull() {
        Assert.assertNotNull(inputHelper.getDigits());
    }

}
