package ro.siit.javaoop1.interfaces.coffee;

public class BasicCoffeeMachine implements CoffeeMachine{
    public void makeCoffee(){
        System.out.println("Bad, not tasty coffee");
    }

    public void nastyOldMethodNobodyWantsToUse(){
        // throw a bomb on coffee shop
    }
}
