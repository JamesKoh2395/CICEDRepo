
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void testAddition() {
        Calculator calc = new Calculator();
        assertEquals(5, calc.add(2, 3));
    }
    @Test
    public void testSubtraction() {
        Calculator calc = new Calculator();
        assertEquals(5, calc.subtraction(8, 3));
    }
    @Test
    public void testMultiplication() {
        Calculator calc = new Calculator();
        assertEquals(24, calc.multiplication(8, 4));
    }
}
