import Calculator.Calculator;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class AdditionTest {

    private static Calculator calculator;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        calculator = new Calculator();
    }


    @Test
    public void addTwoPositives() {
        double num1 = 1;    //first number
        double num2 = 2;    //second number
        double expectedSum = num1 + num2;   //expected sum

        double actualSum = calculator.add(num1, num2);

        assertThat(actualSum, equalTo(expectedSum)); //assertion


    }

    @Test
    public void addTwoNegatives() {
        double num1 = -1;    //first number
        double num2 = -8;    //second number
        double expectedSum = num1 + num2;   //expected sum

        double actualSum = calculator.add(num1, num2);

        assertThat(actualSum, equalTo(expectedSum)); //assertion


    }

    @Test
    public void addPositiveWithNegative() {
        double num1 = -23;    //first number
        double num2 = 8;    //second number
        double expectedSum = num1 + num2;   //expected sum

        double actualSum = calculator.add(num1, num2);

        assertThat(actualSum, equalTo(expectedSum)); //assertion


    }

    @Test
    public void addPositiveWithZero() {
        double num1 = 0;    //first number
        double num2 = 10;    //second number
        double expectedSum = num1 + num2;   //expected sum

        double actualSum = calculator.add(num1, num2);

        assertThat(actualSum, equalTo(expectedSum)); //assertion


    }

    @Test
    public void addNegativeWithZero() {
        double num1 = 0;    //first number
        double num2 = -100;    //second number
        double expectedSum = num1 + num2;   //expected sum

        double actualSum = calculator.add(num1, num2);

        assertThat(actualSum, equalTo(expectedSum)); //assertion


    }
}
