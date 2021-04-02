package ro.siit.javaoop1.interfaces.abstractclasses;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Sorter basicSorter = new BasicSorter();
        basicSorter.initArray();
        int[] basic = basicSorter.executeSorting();
        Arrays.stream(basic).asLongStream().forEach(nr -> System.out.println(nr));


        Sorter keyBoardSorter = new KeyboardSorter();
        keyBoardSorter.initArray();
        int[] keyBoard = keyBoardSorter.executeSorting();
        Arrays.stream(keyBoard).asLongStream().forEach(nr -> System.out.println(nr));
    }
}
