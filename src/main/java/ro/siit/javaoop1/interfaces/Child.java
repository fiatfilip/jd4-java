package ro.siit.javaoop1.interfaces;

public class Child extends Person implements SchoolBoardInterractor{
    public Child(String name) {
        super(name);
    }

    @Override
    public void talkToPrincipal() {
        System.out.println("Hello principal!");
    }

    public void x(){

    }
}
