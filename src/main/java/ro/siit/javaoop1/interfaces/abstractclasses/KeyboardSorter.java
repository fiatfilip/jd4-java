package ro.siit.javaoop1.interfaces.abstractclasses;

import java.util.Scanner;

public class KeyboardSorter extends Sorter{
    @Override
    public void initArray() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Cate numere?");
        int nr = Integer.parseInt(keyboard.nextLine());
        this.arrayToBeSorted = new int[nr];
        for (int i = 0; i < nr; i++) {
            System.out.println("Dati numarul");
            this.arrayToBeSorted[i] = Integer.parseInt(keyboard.nextLine());
        }
    }
}
