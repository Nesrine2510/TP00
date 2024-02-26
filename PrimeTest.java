import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.example.Prime;
public class PrimeTest {

    @Test
    public void testIsPrimeLessThanTwo() {
        assertFalse(Prime.isPrime(-1));
        assertFalse(Prime.isPrime(0));
        assertFalse(Prime.isPrime(1));
    }

    @Test
    public void testIsPrimeTwo() {
        assertTrue(Prime.isPrime(2));
    }

    @Test
    public void testIsPrimePrimeNumbers() {
        assertTrue(Prime.isPrime(3));
        assertTrue(Prime.isPrime(5));
        assertTrue(Prime.isPrime(7));
        assertTrue(Prime.isPrime(11));
    }

    @Test
    public void testIsPrimeNonPrimeNumbers() {
        assertFalse(Prime.isPrime(4));
        assertFalse(Prime.isPrime(6));
        assertFalse(Prime.isPrime(8));
        assertFalse(Prime.isPrime(9));
    }
}
