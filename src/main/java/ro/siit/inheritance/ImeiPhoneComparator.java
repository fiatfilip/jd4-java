package ro.siit.inheritance;

import java.util.Comparator;

public class ImeiPhoneComparator implements Comparator<Phone> {
    @Override
    public int compare(Phone o1, Phone o2) {
        return - o1.getIMEI().toUpperCase().compareTo(o2.getIMEI().toUpperCase());
    }
}
