package ro.siit.temaweek03;

import java.util.Scanner;

public class Message extends Phone implements modelConfigurables {
    private static Scanner inputText = new Scanner(System.in);
    private String phoneNumber;



    public Message(String textMessage, int size){
        //setting max size to 500 characters
//        int maxTextLength = 500;
        this.phoneNumber = phoneNumber;
        if(textMessage.length() >size || size<500) {
            System.out.println("The text size is larger than "+size+" characters, your text will be shorten to fit the number of chars");
            textMessage = textMessage.substring(0,size);
            System.out.println(textMessage);
        }
        else {
            System.out.println("The text size is larger than 500 characters, your text will be shorten to 500 characters");
            textMessage = textMessage.substring(0,size);
            System.out.println(textMessage);
        }

    }


    public static Message createMessage(String textMessage, int size){
        System.out.println("input text message");
        textMessage = inputText.nextLine();
        System.out.println("text size");
        size = inputText.nextInt();
        return new Message(textMessage, size);
    }


    @Override
    public void imei() {

    }

    @Override
    public void batteryLife() {

    }

    @Override
    public void color() {

    }

    @Override
    public void material() {

    }
}
