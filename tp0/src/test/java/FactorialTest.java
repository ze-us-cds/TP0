import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FactorialTest {

    @Test
    void factorialShouldReturnOneForZero() {
        // Arrange & Act
        int result = Factorial.factorial(0);

        // Assert
        assertEquals(1, result);
    }

    @Test
    void factorialShouldReturnOneForOne() {
        // Arrange & Act
        int result = Factorial.factorial(1);

        // Assert
        assertEquals(1, result);
    }

    @Test
    void factorialShouldReturnCorrectValuesForPositiveNumbers() {
        // Arrange & Act
        int result2 = Factorial.factorial(2);
        int result3 = Factorial.factorial(3);
        int result4 = Factorial.factorial(4);
        int result5 = Factorial.factorial(5);

        // Assert
        assertEquals(2, result2);
        assertEquals(6, result3);
        assertEquals(24, result4);
        assertEquals(120, result5);
        // Add more test cases for positive numbers as needed
    }

    @Test
    void factorialShouldThrowExceptionForNegativeNumber() {
        // Act and Assert
        assertThrows(IllegalArgumentException.class, () -> Factorial.factorial(-1));
    }
}


