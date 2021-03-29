package ro.siit.javaoop1.constructors;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person();
        System.out.println(p1.toString());
        p1.setName("Jane Doe");
        System.out.println(p1.toString());

        Person p2 = new Person("Ion Popescu");
        System.out.println(p2.toString());

        Person p3 = new Person(35);
        System.out.println(p3.toString());

        Person p4 = new Person("Boc Emil", 55);
        // p4.nick = "the mayor";
        System.out.println(p4.toString());

        int x = 2;
        Integer Y = 7;
        Integer X = x + Y;
        System.out.println(X.toString());

        System.out.println("----");
        Parent parent = new Parent();
        System.out.println("----");
        Child child = new Child();
    }
}
