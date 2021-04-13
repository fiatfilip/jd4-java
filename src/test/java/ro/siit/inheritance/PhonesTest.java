package ro.siit.inheritance;

import org.junit.Test;

import java.util.*;
import java.util.stream.IntStream;

public class PhonesTest {

    @Test
    public void exer1(){
        Phone[] phones = new Phone[3];
        IntStream.range(0,phones.length)
                .forEach(index -> phones[index] = new Phone());

        IntStream.range(0,phones.length)
                .forEach(index -> System.out.println(phones[index].getIMEI()));


    }

    @Test
    public void exer0(){
        int[] numbers = {6, 4, 8, 9, 1, 4, 6, 2, 0};
        IntStream.range(0,numbers.length)
                .forEach(index -> System.out.print(numbers[index]));
        Arrays.sort(numbers);
        System.out.println();
        IntStream.range(0,numbers.length)
                .forEach(index -> System.out.print(numbers[index]));
    }

    @Test
    public void exer2(){
        List<Phone> phones = new ArrayList<>();
        IntStream.range(0,phones.size())
                .forEach(index -> phones.add(index, new Phone()));

        IntStream.range(0,phones.size())
                .forEach(index -> System.out.println(phones.get(index).getIMEI()));


    }

    @Test
    public void exer3(){
        Set<Phone> phones = new HashSet<>();
        phones.add(new Phone("AAA"));
        phones.add(new Phone("AAA"));

        System.out.println(phones.size());
        for(Phone phone : phones){
            System.out.println(phone.hashCode() + " " + phone.getIMEI() + " " + phone);
        }

    }

    @Test
    public void exer4(){
        Set<Phone> phones = new LinkedHashSet<>();
        phones.add(new Phone("AAAA"));
        phones.add(new Phone("ZZZ"));
        phones.add(new Phone("CCC"));
        phones.add(new Phone("BBB"));

        System.out.println(phones.size());
        for(Phone phone : phones){
            System.out.println(phone.hashCode() + " " + phone.getIMEI() + " " + phone);
        }

    }

    @Test
    public void exer5(){
        Set<Phone> phones = new TreeSet<>(new ImeiPhoneComparator());
        phones.add(new Phone("aaaa"));
        phones.add(new Phone("zzz"));
        phones.add(new Phone("CCC"));
        phones.add(new Phone("BBB"));

        System.out.println(phones.size());
        for(Phone phone : phones){
            System.out.println(phone.hashCode() + " " + phone.getIMEI() + " " + phone);
        }

    }

}
