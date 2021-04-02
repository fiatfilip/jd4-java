package ro.siit.javaoop1.interfaces.coffee;

public class Watson implements CoffeeMachine{
    @Override
    public void makeCoffee() {
        System.out.println("Your coffee, sir!");
    }
}
