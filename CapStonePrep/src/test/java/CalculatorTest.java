import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {




    @Test
    public void shouldDivideTwoPositiveNumbers() {

        Calculator calc = new Calculator();

        assertEquals(3,calc.divide(12,4));

    }

    @Test
    public void shouldNotdivideByZero() {

        Calculator calc = new Calculator();

        assertEquals(0,calc.divide(0,12));

    }


    @Test
    public void shouldDivideNegativeNumbers() {

        Calculator calc = new Calculator();

        assertEquals(-3,calc.divide(12,-4));

    }

}