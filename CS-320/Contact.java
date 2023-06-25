// Creates a Contact and verifies that it meets requirements or throws an exception

public class Contact {
    private final String id;
    private String firstName;
    private String lastName;
    private String phone;
    private String address;

    public Contact(String id, String firstName, String lastName, String phone, String address) {
        // ID should not be null, more than 10 characters, and should not contain whitespace or non-alphanumeric characters
        if (id == null || id.length() > 10 || id.contains(" ") || !id.matches("[a-zA-Z0-9]*")) {
            throw new IllegalArgumentException("Invalid ID");
        }

        if (firstName == null || firstName.length() > 10 || firstName.contains(" ") || !firstName.matches("[a-zA-Z]*")) {
            throw new IllegalArgumentException("Invalid firstName");
        }
        if (lastName == null || lastName.length() > 10 || lastName.contains(" ") || !lastName.matches("[a-zA-Z]*")) {
            throw new IllegalArgumentException("Invalid lastName");
        }
        if (phone == null || phone.length() != 10 || !phone.matches("[0-9]*")) {
            throw new IllegalArgumentException("Invalid phone");
        }
        if (address == null || address.length() > 30 || address.contains("@")) {
            throw new IllegalArgumentException("Invalid address");
        }

        // Assign valid inputs
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.address = address;
    }

    public String getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (firstName == null || firstName.length() > 10 || firstName.contains(" ") || !firstName.matches("[a-zA-Z]*")) {
            throw new IllegalArgumentException("Invalid firstName");
        }
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (lastName == null || lastName.length() > 10 || lastName.contains(" ") || !lastName.matches("[a-zA-Z]*")) {
            throw new IllegalArgumentException("Invalid lastName");
        }
        this.lastName = lastName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        if (phone == null || phone.length() != 10 || !phone.matches("[0-9]*")) {
            throw new IllegalArgumentException("Invalid phone");
        }
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        if (address == null || address.length() > 30 || address.contains("@")) {
            throw new IllegalArgumentException("Invalid address");
        }
        this.address = address;
    }
}
