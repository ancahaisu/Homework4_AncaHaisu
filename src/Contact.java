public class Contact {
    private final String id;
    private final String phoneNumber;
    private final String firstName;
    private final String lastName;

    public Contact(String id, String phoneNumber, String firstName, String lastName) {
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String toString() {
        return id + " - " + firstName + " " + lastName + " - " + phoneNumber;
    }
}