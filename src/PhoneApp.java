public class PhoneApp {

    public void run() {
        // This should not compile because Samsung is abstract.
        // Phone phone = new Samsung();

        Phone phone = new SamsungGalaxyS6("Black", "Glass");

        // Create 2 contacts
        phone.addContact("1", "0770352111", "Anca", "Haisu");
        phone.addContact("2", "0770090080", "Radu", "Daniel");

        // Display contacts
        phone.getFirstContact();
        phone.getLastContact();

        // Send 2 messages to the first contact
        phone.sendMessage("0770352111", "Buna! Ce faci?");
        phone.sendMessage("0770352111", "Sa nu uiti de meeting-ul de azi!");

        // Display messages
        phone.getFirstMessage("0770352111");
        phone.getSecondMessage("0770352111");

        // Make a call to the second contact
        phone.call("0770090080");
        phone.call("0770090080");
        phone.call("0770352111");

        // Display call history
        phone.viewHistory();

        System.out.println("\n================ APPLE TEST ================\n");

        Phone applePhone = new Iphone13("White", "Aluminum");

        applePhone.addContact("1", "0733333333", "Ana", "Ionescu");
        applePhone.addContact("2", "0744444444", "Maria", "Popescu");

        applePhone.getFirstContact();
        applePhone.getLastContact();

        applePhone.sendMessage("0733333333", "Hello, it's meee!");
        applePhone.sendMessage("0733333333", "I was wondering if after all these years you'd like to meet...");

        applePhone.getFirstMessage("0733333333");
        applePhone.getSecondMessage("0733333333");

        applePhone.call("0744444444");

        applePhone.viewHistory();

        System.out.println("Remaining battery: " + applePhone.getCurrentBatteryLife() + " hours");
    }
}
