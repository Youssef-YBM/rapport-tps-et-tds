package ma.ilisi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {
    private final Calculator calculator = new Calculator();

    @Test
    void addAvecZero() {
        assertEquals(3, calculator.add(0, 3));
    }

    @Test
    void addDeuxEntiersPositifs() {
        assertEquals(5, calculator.add(2, 3));
    }

    @Test
    void addAvecNombreNegatif() {
        assertEquals(0, calculator.add(-1, 1));
    }

    @Test
    void addDeuxZeros() {
        assertEquals(0, calculator.add(0, 0));
    }

    @Test
    void multiplyDeuxEntiers() {
        assertEquals(6, calculator.multiply(2, 3));
    }

    @Test
    void multiplyParZero() {
        assertEquals(0, calculator.multiply(0, 5));
    }

    @Test
    void multiplyParUn() {
        assertEquals(7, calculator.multiply(1, 7));
    }

    @Test
    void multiplyAvecNombreNegatif() {
        assertEquals(-6, calculator.multiply(-2, 3));
    }
}
