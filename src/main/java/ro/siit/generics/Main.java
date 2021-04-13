package ro.siit.generics;

import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Pair<Integer, String> pair1 = new Pair<>(2, "Ana");
        pair1.getKey();
        System.out.println(pair1.getValue());

        Pair<Double, Double> pair2 = new Pair<>(2.2, 3.2);
        System.out.println(pair2.getValue());
    }
}
