public class Call {

    private final String phoneNumber;

    public Call(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return "Call to: " + phoneNumber;
    }
}