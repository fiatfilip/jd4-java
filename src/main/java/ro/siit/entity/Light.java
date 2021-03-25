package ro.siit.entity;

public class Light {
    private int lux = 0;
    private int defaultLux = 500;
    private int maxLux = 600;
    private boolean broken = false;

    public void on() {
        if (!broken ) {
            lux = defaultLux;
        }
    }
    public void off() {
        lux = 0;
    }
    public void brighten(int incomingLux) {
        if (lux + incomingLux > maxLux) {
            broken = true;
            off();
        } else {
            lux += incomingLux;
        }
    }
    public void dim(int incomingLux) {
        if (lux >= incomingLux) {
            lux -= incomingLux;
        } else {
            off();
        }
    }
}
