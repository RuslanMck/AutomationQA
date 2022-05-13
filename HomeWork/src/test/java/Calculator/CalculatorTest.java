package Calculator;

import calculator.Calculator;
import org.junit.*;

public class CalculatorTest {

    @BeforeClass
    public static void steUp(){
        System.out.println("Test started");
    }

    @Before
    public void setUpMethod(){
        System.out.println("Before method");
    }

    @After
    public void setDownMethod(){
        System.out.println("After method");
    }
    Calculator calculator = new Calculator();

    @Test
    public void testSum(){
        Assert.assertEquals(4, calculator.calculate("2 + 2"));
        Assert.assertEquals(60, calculator.calculate("20 + 40"));
        Assert.assertEquals(600, calculator.calculate("200 + 400"));
    }

    //негативные тест
    @Test
    public void negativeTest(){
        calculator.calculate("qwerty");
    }

    @Test
    public void testMinus(){
        Assert.assertEquals("Message",2, calculator.calculate("4 - 2"));
        Assert.assertEquals("Message",20, calculator.calculate("40 - 20"));
        Assert.assertEquals("Message",200, calculator.calculate("400 - 200"));
    }

    @AfterClass
    public static void testDown(){
        System.out.println("Test finished");
    }
}
