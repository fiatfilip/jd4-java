package ro.siit.interfaces;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<MilitaryVehicle> army = new ArrayList<>();
        List<FireMachine> fireMachines = new ArrayList();
        // fireMachines.add(new Humvee());
        fireMachines.add(new Fregate());
        fireMachines.add(new Tab());
        fireMachines.get(0).fire();
        fireMachines.get(1).fire();

        fireMachines.stream().forEach(
                fireMachine -> {
                    if(fireMachine instanceof Fregate){
                        fireMachine.fire();
                    }
                }
        );

        System.out.println(fireMachines.get(0).getClass().getName());

        Tank tank = new Tank();
        if(tank instanceof FiringTerestrialVehicle){
            System.out.println("Este!");
        }

        List<Fregate> fregates = new ArrayList<>();
        // fregates.get(0).fire();

    }
}
