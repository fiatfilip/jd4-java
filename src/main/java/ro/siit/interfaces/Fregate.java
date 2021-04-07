package ro.siit.interfaces;

public class Fregate extends MilitaryVehicle implements FireMachine{
    public void getBoiancy(){

    }

    @Override
    public void fire() {
        System.out.println("Fregate fire");
    }
}
