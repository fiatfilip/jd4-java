package ro.siit.javaoop1.interfaces.coffee;

public class CoffeeShop {
    private CoffeeMachine coffeeMachine;

    public CoffeeShop(CoffeeMachine coffeeMachine){
        this.coffeeMachine = coffeeMachine;
    }

    public void brewCoffee(){
        coffeeMachine.makeCoffee();
    }

    public static void main(String[] args) {
        CoffeeShop coffeeShop = new CoffeeShop(new BasicCoffeeMachine());
        coffeeShop.brewCoffee();

        PremiumCoffeeMachine premiumCofeeMachine = new PremiumCoffeeMachine();
        CoffeeShop premiumCoffeeShop = new CoffeeShop(premiumCofeeMachine);
        premiumCoffeeShop.brewCoffee();

        Watson watson = new Watson();
        CoffeeShop richGuyGoffeeShop = new CoffeeShop(watson);
        richGuyGoffeeShop.brewCoffee();
    }
}
