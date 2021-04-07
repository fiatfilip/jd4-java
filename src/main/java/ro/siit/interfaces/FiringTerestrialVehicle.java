package ro.siit.interfaces;

public class FiringTerestrialVehicle extends TerestrialVehicle implements FireMachine{
    @Override
    public void fire() {
        System.out.println("TerestrialVehicle fire");
    }
}
