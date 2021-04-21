package ro.siit.temaweek03;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public abstract class Phone implements modelConfigurables {

    private static Scanner inputText = new Scanner(System.in);
    public static List<Contact> myContact = new ArrayList<>();
    public static List <Message> messages = new ArrayList<>();

//    create contact on phone lvl
   public static void addContact(int id, String phoneNumber,String firstName,String lastName) {
        id= id+myContact.size();
        Contact newContact = Contact.createContact(id,phoneNumber,firstName,lastName);
        myContact.add(newContact);
    }

//    create contact list on phone lvl
    public void listContacts() {
        System.out.println("list size is: " + myContact.size());
        System.out.println("Contact list");
        for(int i = 0; i <myContact.size(); i++) {
            System.out.print("Contact: ");
            System.out.println(this.myContact.get(i).getId() + ". " +
                    this.myContact.get(i).getfirstName() +c
                    " "+
                    this.myContact.get(i).getlastName()+
                    " -> " + this.myContact.get(i).getphoneNumber());
        }
    }


//    create message and message list on phone lvl
    public void sendMessage (String phoneNumber, String messageContent){
        int size = 0;

        Message newMessage = Message.createMessage(messageContent, size);
        messages.add(newMessage);
    }

    public String imeiGenerate() {
        Random randNr = new Random();
        String imei= "";
        for (int i= 0; i<17; i++){
            if(i==2||i==9 || i ==16 ){
                imei = imei + "-";
                i++;
            }
            imei = imei+ randNr.nextInt(10);
        }
        System.out.println(imei);
        return imei;
    }

    public int phoneBatteryLife(){
        System.out.println("What is the life of the battery from phone");
        int battery_life= inputText.nextInt();
       return battery_life;
    }

    public String phoneColor(){
        System.out.println("what color is the phone?");
        String color= inputText.next();
        return color;
    }

    public String phoneMaterial(){
        System.out.println("what material was used for the phone?");
        String material =  inputText.next();
        return material;
    }
}
