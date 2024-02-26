
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.example.Fibonacci;
public class FibonacciTest {

    @Test
    public void testFibonacciPositive() {

        assertEquals(0, Fibonacci.fibonacci(0));
        assertEquals(1, Fibonacci.fibonacci(1));
        assertEquals(1, Fibonacci.fibonacci(2));
        assertEquals(2, Fibonacci.fibonacci(3));
        assertEquals(3, Fibonacci.fibonacci(4));
        assertEquals(5, Fibonacci.fibonacci(5));

    }

    @Test
    public void testFibonacciNegative() {

        assertThrows(IllegalArgumentException.class, () -> Fibonacci.fibonacci(-1));
    }

    @Test
    public void testFibonacciZero() {

        assertEquals(0, Fibonacci.fibonacci(0));
    }
}
