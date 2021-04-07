package ro.siit.enums;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> prs = new ArrayList<>();
        Person p = new Person();
        p.setBirthMonth(Month.IUN);
        prs.add(p);

        p = new Person();
        p.setBirthMonth(Month.MAI);
        prs.add(p);

        p = new Person();
        p.setBirthMonth(Month.IAN);
        prs.add(p);

        p = new Person();
        p.setBirthMonth(Month.OCT);
        prs.add(p);

        p = new Person();
        p.setBirthMonth(Month.DEC);
        prs.add(p);

        p = new Person();
        p.setBirthMonth(Month.IAN);
        prs.add(p);


        prs.stream().forEach(
                person -> {
                   if (person.getBirthMonth().equals(Month.IAN)) {
                       System.out.println(person.getBirthMonth().name() + " " + person.getBirthMonth().getNoOfDays());
                   }
                }
        );

        p.executeCommand(Command.CLOSE_RIGHT_REAR_DOOR);
    }
}
