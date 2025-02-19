package task;


import com.learn.task1.Auto;
import com.learn.task1.Car;
import com.learn.task1.Task1;
import com.learn.task1.Truck;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Task1Test {
    private Task1 task1;

    @Before
    public void setUp() {
        List<Auto> autos = Arrays.asList(
                new Car("Toyota", 20000),
                new Car("Honda", 22000),
                new Truck("Ford", 35000),
                new Car("Toyota", 20000),
                new Truck("Chevrolet", 40000)
        );
        task1 = new Task1(autos);
    }

    @Test
    public void testFilterByPrice() {
        List<Auto> result = task1.filterByPrice(25000);
        assertEquals(2, result.size());
    }

    @Test
    public void testSortByPrice() {
        List<Auto> result = task1.sortByPrice();
        assertEquals(20000, result.getFirst().getPrice(), 0.01);
        assertEquals(40000, result.getLast().getPrice(), 0.01);
    }

    @Test
    public void testMostCommonPrice() {
        Optional<Double> result = task1.mostCommonPrice();
        assertTrue(result.isPresent());
        assertEquals(20000, result.get(), 0.01);
    }
}
