package ro.siit.unittesting;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Unit test for simple Calculator.
 */
public class CalculatorTest
{

    @Before
    public void before(){
        System.out.println("done before");
    }

    @After
    public void after(){
        System.out.println("done after");
    }

    @Test
    // @Ignore
    public void additionShouldWork()
    {
        Calculator calculator = new Calculator();
        Random randomizer = new Random();
        int a = randomizer.nextInt(10);
        int b = randomizer.nextInt(10);
        System.out.println(a + b);
        assertEquals(a + b, calculator.sum(a, b));
    }

    @Test
    public void diffShouldWork2()
    {
        Calculator calculator = new Calculator();
        Random randomizer = new Random();
        int a = randomizer.nextInt(10);
        int b = randomizer.nextInt(10);
        System.out.println(a - b);
        assertEquals(a - b, calculator.diff(a, b));
    }
}
