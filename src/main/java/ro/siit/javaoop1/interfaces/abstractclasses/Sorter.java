package ro.siit.javaoop1.interfaces.abstractclasses;

public abstract class Sorter {
    int[] arrayToBeSorted;

    public int[] executeSorting(){
        // fancy sorting algorithm
        return arrayToBeSorted;
    }

    public abstract void initArray();
}
