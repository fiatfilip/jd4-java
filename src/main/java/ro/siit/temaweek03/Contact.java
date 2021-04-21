package ro.siit.temaweek03;

import java.util.ArrayList;
import java.util.Scanner;

public class Contact  {
    private int id;
    Scanner inputText = new Scanner(System.in);
    private String phoneNumber, firstName, lastName;


//    introducing the contact details
    public  Contact(int id, String phoneNumber, String firstName, String lastName) {
        this.id= id;
        System.out.println("phone nr: ");
        this.phoneNumber = inputText.nextLine();
        System.out.println("first name");
        this.firstName = inputText.nextLine();
        System.out.println("last name");
        this.lastName = inputText.nextLine();
    }


//    return contact details
    public int getId() {
        return id;
    }

    public String getlastName() {
        return lastName;
    }

    public String getfirstName() {
        return firstName;
    }

    public String getphoneNumber() {
        return phoneNumber;
    }

//    Create the list of contacts
    public static Contact createContact(int id, String phoneNumber, String firstName, String lastName) {
        return new Contact(id,phoneNumber,firstName,lastName);
    }

}
