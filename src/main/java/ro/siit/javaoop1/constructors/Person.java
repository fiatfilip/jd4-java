package ro.siit.javaoop1.constructors;

public class Person {
    public String name = "John Doe";
    public Integer age;

    public final String nick; // = "big hoss";

    public Person(){
        this.nick = "name";
    }

    public Person(String name){
        this.nick = name;
       // this.name = name;
        setName(name);
    }

//    public Person(String nickname){
//        this.name = nickname;
//    }

    public Person(int age){
        this.age = age;
        this.nick = "big hoss";
    }

    public Person(String name, int age){
        this(age);
        // this(name);
        this.name = name;
    }

    @Override
    public String toString() {
        // return name + " : " + age;
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setNick(String nick){
       // this.nick = nick;
    }
}

class NonPublic{

}
