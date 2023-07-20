import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    @Test
    void fourPlusSixEqualsTen() {
        // object creation or arrange test
        var calulator = new Calculator();
        assertEquals(10, calulator.add(4, 6));// give assumption check
    }

    @Test
    void twoPlusSixEqualsEight() {
        // object creation or arrange test
        var calulator = new Calculator();
        assertEquals(8, calulator.add(2, 6));// give assumption check
    }

    @Test
    void tenSubtractSixEqualsFour() {
        // object creation or arrange test
        var calulator = new Calculator();
        assertEquals(4, calulator.subtract(10, 6));// give assumption check
    }

    @Test
    void fiftySubtractTwentyFiveEqualsTwentyFive() {
        // object creation or arrange test
        var calulator = new Calculator();
        assertEquals(25, calulator.subtract(50, 26));// give assumption check

    }
}