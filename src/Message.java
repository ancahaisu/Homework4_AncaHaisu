public class Message {

    private final String phoneNumber;
    private final String content;

    public Message(String phoneNumber, String content) {
        if (content.length() > 100) {
            throw new IllegalArgumentException("Message cannot contain more than 100 characters");
        }

        this.phoneNumber = phoneNumber;
        this.content = content;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
    @Override
    public String toString() {
        return "To: " + phoneNumber + " | Message: " + content;
    }
}