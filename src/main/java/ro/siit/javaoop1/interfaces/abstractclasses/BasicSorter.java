package ro.siit.javaoop1.interfaces.abstractclasses;

public class BasicSorter extends Sorter {
    @Override
    public void initArray() {
        this.arrayToBeSorted = new int[]{1, 2, 3};
    }
}
