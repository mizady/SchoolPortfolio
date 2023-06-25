import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ContactTest {

    @Test
    public void testContactCreation() {

        assertThrows(IllegalArgumentException.class, () -> new Contact(null, "John", "Doe", "1234567890", "123 Street"));
        assertThrows(IllegalArgumentException.class, () -> new Contact("12345678901", "John", "Doe", "1234567890", "123 Street"));
        assertThrows(IllegalArgumentException.class, () -> new Contact("1", null, "Doe", "1234567890", "123 Street"));
        assertThrows(IllegalArgumentException.class, () -> new Contact("1", "JohnJohnJohn", "Doe", "1234567890", "123 Street"));
        assertThrows(IllegalArgumentException.class, () -> new Contact("1", "John", null, "1234567890", "123 Street"));
        assertThrows(IllegalArgumentException.class, () -> new Contact("1", "John", "DoeDoeDoeDoe", "1234567890", "123 Street"));
        assertThrows(IllegalArgumentException.class, () -> new Contact("1", "John", "Doe", null, "123 Street"));
        assertThrows(IllegalArgumentException.class, () -> new Contact("1", "John", "Doe", "12345678901", "123 Street"));
        assertThrows(IllegalArgumentException.class, () -> new Contact("1", "John", "Doe", "1234567890", null));
        assertThrows(IllegalArgumentException.class, () -> new Contact("1", "John", "Doe", "1234567890", "123 Street that is a little too long"));

        // Tests for white spaces and special characters
        assertThrows(IllegalArgumentException.class, () -> new Contact("12345678901", "John ", "Doe", "1234567890", "123 Street"));
        assertThrows(IllegalArgumentException.class, () -> new Contact("12345678901", "John@", "Doe", "1234567890", "123 Street"));
        assertThrows(IllegalArgumentException.class, () -> new Contact("12345678901", "John", "Doe ", "1234567890", "123 Street"));
        assertThrows(IllegalArgumentException.class, () -> new Contact("12345678901", "John", "Doe@", "1234567890", "123 Street"));
        assertThrows(IllegalArgumentException.class, () -> new Contact("12345678901", "John", "Doe", "1234567890", "123 Street "));
        assertThrows(IllegalArgumentException.class, () -> new Contact("12345678901", "John", "Doe", "1234567890", "123 Street@"));
    }

}
