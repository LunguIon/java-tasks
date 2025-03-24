package Ex_2;

import com.learn.task2.ex_2.Ex2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class Ex2Tests {
    Ex2 ex2 = new Ex2();
    String make;
    @Before
    public void setUp() {
        ex2.setUp();
        make = ex2.getMake();
    }

    @Test
    public void testSetUpSuccessful() {
        String result = new Ex2().setUp();
        assertEquals("the file was read successfully",result);
    }

    @Test
    public void testRunCar() {
        String result = ex2.runCar().go();
        assertEquals("The " + make + " Car is running", result);
    }

    @Test
    public void testRunTruck() {
        String result = ex2.runTruck().go();
        assertEquals("The " + make + " Truck is running", result);
    }

    @Test
    public void testRunMotorcycle() {
        String result = ex2.runMotorcycle().go();
        assertEquals("The " + make + " Motorcycle is running", result);
    }



}
