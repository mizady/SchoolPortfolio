import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ContactServiceTest {
    @Test
    public void testContactService() {
        // Create a new instance of the ContactService class.
        ContactService service = new ContactService();

        // Try adding a contact with invalid parameters.
        // This should throw an IllegalArgumentException due to the ID being null.
        assertThrows(IllegalArgumentException.class, () -> service.addContact(new Contact(null, "John", "Doe", "1234567890", "123 Street")));

        // Add a new contact to the service with valid parameters.
        service.addContact(new Contact("1", "John", "Doe", "1234567890", "123 Street"));

        // Try adding a contact with an ID that already exists in the service.
        // This should throw an IllegalArgumentException.
        assertThrows(IllegalArgumentException.class, () -> service.addContact(new Contact("1", "John", "Doe", "1234567890", "123 Street")));

        // Delete the contact that we added before.
        service.deleteContact("1");

        // Try to add the contact again. Now it should be successful as the contact with the same ID has been deleted.
        service.addContact(new Contact("1", "John", "Doe", "1234567890", "123 Street"));

        // Update the contact with new values.
        service.updateContact("1", "Jane", "Doe", "0987654321", "321 Street");

        // Try updating a contact that does not exist in the service.
        // This should throw an IllegalArgumentException.
        assertThrows(IllegalArgumentException.class, () -> service.updateContact("2", "Jane", "Doe", "0987654321", "321 Street"));
    }
}
