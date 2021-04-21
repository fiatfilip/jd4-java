package ro.siit.inheritance;

import java.util.Objects;
import java.util.Random;
import java.util.UUID;

public class Phone /*implements Comparable<Phone>*/{

    private final String IMEI;

    public Phone() {
        // modelConfigurables = imei;
        IMEI = generateIMEI();
    }

    public Phone(String imei) {
        IMEI = imei;
        // modelConfigurables = generateIMEI();
    }

    public String getIMEI() {
        return IMEI;
    }

    private String generateIMEI(){
        String imei = UUID.randomUUID()
                .toString()
                .replace("-", "")
                .substring(0,15).toUpperCase();


        String template = "ABCDEFGHIJ0123456789";
        StringBuffer sb = new StringBuffer();
        Random random = new Random();
        for (int i = 0; i < 15; i++) {
            int nr = random.nextInt(15);
            sb.append(template.substring(nr, nr + 1));
        }
        return sb.toString();
        //return imei;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Phone phone = (Phone) o;
        return IMEI.equals(phone.IMEI);
    }

    @Override
    public int hashCode() {
        return Objects.hash(IMEI);
    }

   // @Override
    public int compareTo(Phone o) {
        return this.getIMEI().toUpperCase().compareTo(o.getIMEI().toUpperCase());
    }
}
