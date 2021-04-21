package ro.siit.temaweek03;


import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        int id= 1;
        String phoneNumber ="";
        String lastName="";
        String firstName= "";
        String messageContent= "";

        Phone phone = new Samsung_Galaxy6();

//        Creating the phone configurables
        phone.imei();
        phone.batteryLife();
        phone.color();
        phone.material();

//        create contact

        phone.addContact(id, phoneNumber, firstName, lastName);
        phone.addContact(id, phoneNumber, firstName, lastName);
        phone.listContacts();




        phone.sendMessage(phoneNumber, messageContent);
        phone.sendMessage(phoneNumber, messageContent);
//        phone.listMessages(phoneNumber);
    }




}
