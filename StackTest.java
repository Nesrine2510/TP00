import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.example.Stack;
public class StackTest {

    @Test
    public void testPushAndPop() {
        Stack stack = new Stack();
        stack.push(42);
        assertEquals(42, stack.pop());
    }

    @Test
    public void testPeek() {
        Stack stack = new Stack();
        stack.push(42);
        assertEquals(42, stack.peek());
    }

    @Test
    public void testIsEmpty() {
        Stack stack = new Stack();
        assertTrue(stack.isEmpty());

        stack.push(42);
        assertFalse(stack.isEmpty());
    }

    @Test
    public void testSize() {
        Stack stack = new Stack();
        assertEquals(0, stack.size());

        stack.push(42);
        assertEquals(1, stack.size());
    }

    @Test
    public void testPopEmptyStack() {
        Stack stack = new Stack();
        assertThrows(IllegalStateException.class, stack::pop);
    }

    @Test
    public void testPeekEmptyStack() {
        Stack stack = new Stack();
        assertThrows(IllegalStateException.class, stack::peek);
    }

    @Test
    public void testExpandArray() {
        Stack stack = new Stack();
        for (int i = 0; i < 20; i++) {
            stack.push(i);
        }
        assertEquals(19, stack.pop());
    }
}
