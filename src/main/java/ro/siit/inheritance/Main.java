package ro.siit.inheritance;

public class Main {

    public static void main(String[] args) {
        Phone phone = new IPhone7s();

        Phone phone2 = new IPhone7();

        System.out.println(phone.getIMEI());

        String name = "Ana";
        String name2 = "Ana";
        name2 = name2 + " are mere";

    }
}
