package ro.siit.entity;

public class Bike {
    private String color;
    public String make;
    public int wheelsSize;
    public boolean isStopped = true;

    public void brake() {
        System.out.println("Brake was hit!");
        isStopped = true;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMake() {
        return make;
    }
}
