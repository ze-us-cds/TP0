import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {

    @Test
    void fibonacciShouldThrowExceptionForNegativeNumbers() {
        assertThrows(IllegalArgumentException.class, () -> Fibonacci.fibonacci(-1));
    }

    @Test
    void fibonacciShouldReturnZeroForZero() {
        assertEquals(0, Fibonacci.fibonacci(0));
    }

    @Test
    void fibonacciShouldReturnOneForOne() {
        assertEquals(1, Fibonacci.fibonacci(1));
    }

    @Test
    void fibonacciShouldReturnCorrectValuesForNumbersGreaterThanOne() {
        assertEquals(1, Fibonacci.fibonacci(2));
        assertEquals(2, Fibonacci.fibonacci(3));
        assertEquals(3, Fibonacci.fibonacci(4));
        assertEquals(5, Fibonacci.fibonacci(5));
        assertEquals(8, Fibonacci.fibonacci(6));
        // Add more assertions as needed
    }
}
