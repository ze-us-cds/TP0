import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PrimeTest {

    @Test
    public void isPrimeShouldReturnFalseForNegativeAndNumbersLessThanTwo() {
        assertFalse(Prime.isPrime(-1));
        assertFalse(Prime.isPrime(0));
        assertFalse(Prime.isPrime(1));
    }

    @Test
    public void isPrimeShouldReturnFalseForCompositeNumbers() {
        assertFalse(Prime.isPrime(4));
        assertFalse(Prime.isPrime(6));
        assertFalse(Prime.isPrime(8));
        assertFalse(Prime.isPrime(9));
        // Add more composite numbers as needed
    }

    @Test
    public void isPrimeShouldReturnTrueForPrimeNumbers() {
        assertTrue(Prime.isPrime(2));
        assertTrue(Prime.isPrime(3));
        assertTrue(Prime.isPrime(5));
        assertTrue(Prime.isPrime(7));
        // Add more prime numbers as needed
    }

    @Test
    public void isPrimeShouldReturnFalseForPerfectSquareOfPrimeNumbers() {
        assertFalse(Prime.isPrime(4)); // 2 * 2
        assertFalse(Prime.isPrime(9)); // 3 * 3
        assertFalse(Prime.isPrime(25)); // 5 * 5
        // Add more perfect square of prime numbers as needed
    }

    @Test
    public void isPrimeShouldReturnFalseForLargeCompositeNumbers() {
        assertFalse(Prime.isPrime(100));
        assertFalse(Prime.isPrime(1000));
        assertFalse(Prime.isPrime(10000));
        // Add more large composite numbers as needed
    }

    @Test
    public void isPrimeShouldReturnTrueForLargePrimeNumbers() {
        assertTrue(Prime.isPrime(89));
        assertTrue(Prime.isPrime(97));
        assertTrue(Prime.isPrime(101));
        assertTrue(Prime.isPrime(103));
        assertTrue(Prime.isPrime(107));
        assertTrue(Prime.isPrime(109));
        assertTrue(Prime.isPrime(113));
        // Add more large prime numbers as needed
    }
}
