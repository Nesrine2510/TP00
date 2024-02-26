import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

import org.example.Person;
import org.junit.jupiter.api.Test;

public class PersonTest {

    @Test
    public void testGetFullName() {
        Person person = new Person("John", "Doe", 25);

        String fullName = person.getFullName();
        assertEquals("John Doe", fullName);
    }

    @Test
    public void testIsAdultTrue() {
        Person person = new Person("Alice", "Smith", 20);

        boolean isAdult = person.isAdult();

        assertTrue(isAdult);
    }

    @Test
    public void testIsAdultFalse() {
        Person person = new Person("Bob", "Johnson", 16);

        boolean isAdult = person.isAdult();

        assertFalse(isAdult);
    }
}
