import org.junit.Test;
import org.pk.Calculator;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    public void testAdd() {
        assertEquals(5, calculator.add(2, 3));
    }

    @Test
    public void testSubtraction() {
        assertEquals(1, calculator.subtract(3, 2));
    }

    @Test
    public void testMultiplication() {
        assertEquals(6, calculator.multiplication(2, 3));
    }

    @Test
    public void testDivide() {
        assertEquals(1, calculator.division(3, 2));
    }

    @Test
    public void testPower() {
        assertEquals(16.0, calculator.power(2, 4), 0.0001);
        assertEquals(1.0, calculator.power(5, 0), 0.0001);
        assertEquals(0.25, calculator.power(2, -2), 0.0001);
    }

    @Test
    public void testModulus() {
        assertEquals(1, calculator.modulus(10, 3));
    }

    @Test
    public void testFactorial() {
        assertEquals(120, calculator.factorial(5));
        assertEquals(1, calculator.factorial(0));
        assertEquals(1, calculator.factorial(1));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNegativeFactorialNumber() {
        calculator.factorial(-1);
    }
}
