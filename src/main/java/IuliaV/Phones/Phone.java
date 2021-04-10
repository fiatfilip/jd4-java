package IuliaV.Phones;

import java.util.ArrayList;
import java.util.List;

public class Phone {
    public String color = "default grey";
    public String material = "default plastic";
    private int batteryLife;
    final double imei;
    private List<String> callHistory = new ArrayList<>();
    private Contact[] contactsList = new Contact[3];
    static class Contact {
        private String phoneNumber;
        private String firstName;
        private String lastName;
        private String[] messagesList = new String[50];
        private int messageIndex;

        public Contact(String phoneNumber, String firstName, String lastName) {
            this.phoneNumber = phoneNumber;
            this.firstName = firstName;
            this.lastName = lastName;
            this.messageIndex = 0;
        }

    }

    public Phone() {
        this.imei = Math.random();
        this.batteryLife = 48;
    }

    void addContact(int index, String phoneNumber, String firstName, String lastName) {
        contactsList[index] = new Contact(phoneNumber, firstName, lastName);
    }

    void listContacts() {
        for (int i = 0; i < contactsList.length; i++) {
            if (this.contactsList[i].lastName != null && this.contactsList[i].firstName != null) {
                System.out.println("Contact " + i + " is : " + this.contactsList[i].lastName + " " + this.contactsList[i].firstName);
            }
        }
    }

    void sendMessage(String phoneNumber, String message) {
        if (message.length() > 100) {
            System.out.println("Max length for messages is 100 characters.");
            return;
        }
        Contact receiver = this.findContact(phoneNumber);
        if (batteryLife >= 1 && receiver.messageIndex < 50) {
            this.batteryLife -= 1;
            receiver.messagesList[receiver.messageIndex] = message;
            receiver.messageIndex++;
            System.out.println("Your message has been sent to : " + phoneNumber);
        } else {
            String errorMessage = receiver.messageIndex >= 50
                    ? "Message not sent - inbox capacity for this contact is full."
                    : "Message not sent - battery too low. Please charge and try again.";
            System.out.println(errorMessage);
        }
    }

    void listMessages(String phoneNumber) {
        Contact receiver = this.findContact(phoneNumber);
        if (receiver.messageIndex == 0) {
            System.out.println("No message records with " + receiver.phoneNumber + ".");
            return;
        }
        System.out.println("Conversation with " + receiver.lastName + " " + receiver.firstName + " : ");
        for (int i = 0; i < receiver.messageIndex; i++) {
            System.out.println(receiver.messagesList[i]);
        }
    }
    void call(String phoneNumber) {
        if (this.batteryLife > 1) {
            this.callHistory.add(phoneNumber);
            batteryLife --;
        } else {
            System.out.println("Battery too low. Cannot make call");
        }
    }
    void viewHistory() {
        System.out.println("Call history: ");
        this.callHistory.forEach(calledNumber -> System.out.println(calledNumber));
    }

    private Contact findContact(String phoneNumber) {
        int index = 0;
        for (int i = 0; i < this.contactsList.length; i++) {
            if (this.contactsList[i].phoneNumber.equals(phoneNumber)) {
                index = i;
                break;
            }
        }
        return this.contactsList[index];
    }
}
