package ro.siit;

import ro.siit.entity.Bike;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Bike bike1 = new Bike();
        bike1.isStopped = false;
        bike1.brake();
        bike1.make = args[0];
        System.out.println(bike1.isStopped);
        System.out.println(bike1.getMake());

        Bike bike2 = new Bike();
        bike2.make = args[1];
        bike2.setColor( "RED");
        System.out.println(bike2.getColor());
        System.out.println(bike2.getMake());

        ex1();
        ex2();
    }

    static void ex1(){

    }

    static void ex2(){

    }
}
