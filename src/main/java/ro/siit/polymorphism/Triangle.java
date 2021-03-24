package ro.siit.polymorphism;

public class Triangle extends Shape{
    private int value;
    public void flipHorizontally(){
        System.out.println("I'm flipping horizontally");
    }

    public void changeValue(int value){
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
