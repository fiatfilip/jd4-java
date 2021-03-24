package ro.siit.polymorphism;

public class Circle extends Shape{

//    public void whoami(){
//        System.out.println("I am a circle");
//    }

    /**
     *
     */
    @Override
    public void whoami(){
        System.out.println("I am a circle");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
