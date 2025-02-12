
import org.example.Calculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    void testAddition() {
        Calculator calculator = new Calculator();
        assertEquals(5.0, calculator.Addition(2.0, 3.0));
    }

    @Test
    void testSubtraction() {
        Calculator calculator = new Calculator();
        assertEquals(1.0, calculator.Subtraction(5.0, 4.0));
    }

    @Test
    void testMultiplication() {
        Calculator calculator = new Calculator();
        assertEquals(6.0, calculator.Multiplication(2.0, 3.0));
    }

    @Test
    void testDivision() {
        Calculator calculator = new Calculator();
        assertEquals(10.0, calculator.Division(20.0, 2.0));
    }

    @Test
    void testModulus() {
        Calculator calculator = new Calculator();
        assertEquals(2.0, calculator.Modulus(2.0, 3.0));
    }
}