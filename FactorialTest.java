import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.example.Factorial;
public class FactorialTest {

    @Test
    public void testFactorialZero() {

        assertEquals(1, Factorial.factorial(0));
    }

    @Test
    public void testFactorialOne() {

        assertEquals(1, Factorial.factorial(1));
    }

    @Test
    public void testFactorialPositive() {

        assertEquals(120, Factorial.factorial(5));
        assertEquals(720, Factorial.factorial(6));

    }

    @Test
    public void testFactorialNegative() {

        assertThrows(IllegalArgumentException.class, () -> Factorial.factorial(-1));
    }
}

