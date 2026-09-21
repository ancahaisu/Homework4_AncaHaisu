import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public abstract class Phone {

    private int batteryLife;
    private String color;
    private String material;
    // Current battery level
    private int currentBatteryLife;

    // Instance specific
    private final String imei;

    // Contacts, messages, and calls lists
    private final List<Contact> contacts;
    private final List<Message> messages;
    private final List<Call> calls;

    protected Phone(int batteryLife, String color, String material) {
        this.currentBatteryLife = batteryLife;
        this.imei = UUID.randomUUID().toString();

        this.contacts = new ArrayList<>();
        this.messages = new ArrayList<>();
        this.calls = new ArrayList<>();
    }

    public void addContact(String id, String phoneNumber, String firstName, String lastName) {
        Contact contact = new Contact(id, phoneNumber, firstName, lastName);
        contacts.add(contact);
    }

    public void getFirstContact() {
        if (contacts.isEmpty()) {
            System.out.println("There are no contacts.The agenda is empty.");
            return;
        }
        System.out.println("First contact: " + contacts.get(0));
    }

    public void getLastContact() {
        if (contacts.isEmpty()) {
            System.out.println("There are no contacts.The agenda is empty.");
            return;
        }
        System.out.println("Last contact: " + contacts.get(contacts.size() - 1));
    }

    public void sendMessage(String phoneNumber, String content) {
        if (content.length() > 100) {
            throw new IllegalArgumentException("Message cannot contain more than 100 characters.");
        }
        if (currentBatteryLife < 1) {
            System.out.println("Not enough battery to send a message.");
            return;
        }
        Message message = new Message(phoneNumber, content);
        messages.add(message);
        currentBatteryLife--;
        System.out.println("Message sent to " + phoneNumber);
    }

    public void getFirstMessage(String phoneNumber) {

        for (Message message : messages) {
            if (message.getPhoneNumber().equals(phoneNumber)) {
                System.out.println("First message: " + message);
                return;
            }
        }
        System.out.println("No messages found for " + phoneNumber);
    }

    public void getSecondMessage(String phoneNumber) {
        int count = 0;
        for (Message message : messages) {
            if (message.getPhoneNumber().equals(phoneNumber)) {
                count++;
                if (count == 2) {
                    System.out.println("Second message: " + message);
                    return;
                }
            }
        }
        System.out.println("There is no second message for " + phoneNumber);
    }

    public void call(String phoneNumber) {
        if (currentBatteryLife < 2) {
            System.out.println("Not enough battery to make a call.");
            return;
        }
        Call call = new Call(phoneNumber);
        calls.add(call);
        currentBatteryLife -= 2;
        System.out.println("Calling " + phoneNumber);
    }

    public void viewHistory() {
        if (calls.isEmpty()) {
            System.out.println("Call history is empty.");
            return;
        }
        System.out.println("Call history:");
        for (Call call : calls) {
            System.out.println(call);
        }
    }
    public int getCurrentBatteryLife() {
        return currentBatteryLife;
    }
//    public int getBatteryLife() {
//        return batteryLife;
//    }
//
//    public int getCurrentBatteryLife() {
//        return currentBatteryLife;
//    }
//
//    public String getColor() {
//        return color;
//    }
//
//    public void setColor(String color) {
//        this.color = color;
//    }
//
//    public String getMaterial() {
//        return material;
//    }
//
//    public void setMaterial(String material) {
//        this.material = material;
//    }
//
//    public String getImei() {
//        return imei;
//    }
}