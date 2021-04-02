package ro.siit.javaoop1.interfaces;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        Child child = new Child("Georgel");
        // child.vote();
        persons.add(child);
        Adult adult = new Adult("David");
        persons.add(adult);

        for (Person person: persons) {
            System.out.println(person);
        }

        List<Voter> voters = new ArrayList<>();
        voters.add(adult);
        voters.add(new Senior("Popescu"));
        voters.stream().forEach(voter -> System.out.println(voter.vote()));
//        for (Voter voter: voters) {
//        System.out.println(voter.vote());
//        }

        List<SchoolBoardInterractor> schoolBoardInterractors = new ArrayList<>();
        schoolBoardInterractors.add(child);
        schoolBoardInterractors.add(adult);
        schoolBoardInterractors.stream().forEach(schoolBoardInterractor -> schoolBoardInterractor.talkToPrincipal());

        Person p = adult;

        // Person prs = new Child("prs");
        // Adult a = (Adult)prs;

        Voter v1 = new Adult("adult");
        System.out.println(v1.vote());
        Voter v2 = new Senior("senior");
        System.out.println(v2.vote());
        Voter v3 = new MickeyMouseVoter();
        System.out.println(v3.vote());
        Voter v4 = new Voter() {
            @Override
            public String vote() {
                return "I vote for Minnie";
            }

            @Override
            public void x() {

            }

            @Override
            public String x(int nr) {
                return null;
            }
        };
        System.out.println(v4.vote());
    }
}
