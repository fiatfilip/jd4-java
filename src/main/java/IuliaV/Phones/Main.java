package IuliaV.Phones;

public class Main {
    public static void main(String[] args) {
        Phone mikiPhone = new SamsungGalaxy6();
        Phone phone = new HuaweiP20();
        HuaweiP20 pufiPhone = (HuaweiP20) phone;

        mikiPhone.addContact(0, "0733966708", "Miki", "Voicu");
        mikiPhone.addContact(1, "0733966709", "Iulia", "Voicu");
        mikiPhone.addContact(2, "0744563053", "Pufi", "Voicu");
        mikiPhone.listContacts();
        mikiPhone.sendMessage("0733966708", "Henlo, fren!");
        mikiPhone.sendMessage("0733966709", "How is gusy?");
        mikiPhone.listMessages("0733966708");
        mikiPhone.listMessages("0733966709");
        mikiPhone.call("0733966709");
        mikiPhone.call("0723123111");
        mikiPhone.call("0723123222");
        mikiPhone.call("0723123999");
        mikiPhone.viewHistory();
        System.out.println(pufiPhone.color);
        pufiPhone.color = "red sunset";
        System.out.println(pufiPhone.color);
    }
}
