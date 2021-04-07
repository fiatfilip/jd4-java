package ro.siit.enums;

public enum Month {

    IAN(31), FEB(28), MAR(31), APR(30),
    MAI(31), IUN(30), IUL(31), AUG(31),
    SEP(30), OCT(31), NOV(30), DEC(31);

    private final int noOfDays;

    Month(int noOfDays){
        this.noOfDays = noOfDays;
    }

    public int getNoOfDays() {
        return noOfDays;
    }
}
