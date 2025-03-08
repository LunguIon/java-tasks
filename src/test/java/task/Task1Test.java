package task;


import com.learn.task1.Auto;
import com.learn.task1.Car;
import com.learn.task1.Task1;
import com.learn.task1.Truck;
import org.junit.Before;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Task1Test {
    private Task1 task1;
    private Task1 testEmpty;
    private Task1 testSingleElement;

    @Before
    public void setUp() {
        List<Auto> autos = Arrays.asList(
                new Car("Toyota", 20000),
                new Car("Honda", 22000),
                new Truck("Ford", 35000),
                new Car("Toyota", 20000),
                new Truck("Chevrolet", 40000)
        );
        List<Auto> emptyList = new ArrayList<>();
        List<Auto> singleElement = List.of(new Car("Mazda", 15000));

        task1 = new Task1(autos);
        testEmpty = new Task1(emptyList);
        testSingleElement = new Task1(singleElement);

    }

    @Test
    public void testFilterByPrice() {
        List<Auto> result = task1.filterByPrice(25000);
        assertEquals(2, result.size());
    }

    @Test
    public void testFilterByPriceEmpty() {
        List<Auto> result = testEmpty.filterByPrice(1);
        assertEquals(0, result.size());
    }

    @Test
    public void testFilterByPriceSingleElement() {
        List<Auto> result = testSingleElement.filterByPrice(10000);
        assertEquals(1, result.size());
        assertEquals(15000, result.getFirst().getPrice(), 0.01);
    }




    @Test
    public void testSortByPrice() {
        List<Auto> result = task1.sortByPrice();
        assertEquals(20000, result.getFirst().getPrice(), 0.01);
        assertEquals(40000, result.getLast().getPrice(), 0.01);
    }

    @Test
    public void testSortByPriceEmpty() {
        List<Auto> result = testEmpty.sortByPrice();
        assertEquals(0, result.size());
    }

    @Test
    public void testSortByPriceSingleElement() {
        List<Auto> result = testSingleElement.sortByPrice();
        assertEquals(1, result.size());
        assertEquals(15000, result.getFirst().getPrice(), 0.01);
    }


    @Test
    public void testFindMostCommonPrice() {
        Optional<Double> result = task1.findMostCommonPrice();
        assertTrue(result.isPresent());
        assertEquals(20000, result.get(), 0.01);
    }

    @Test
    public void testFindMostCommonPriceEmpty() {
        Optional<Double> result = testEmpty.findMostCommonPrice();
        assertTrue(result.isEmpty());
    }

    @Test
    public void testFindMostCommonPriceSingleElement() {
        Optional<Double> result = testSingleElement.findMostCommonPrice();
        assertTrue(result.isPresent());
        assertEquals(15000, result.get(), 0.01);
    }

    @Test
    public void testFindMostExpensiveAuto() {
        Optional<Auto> result = task1.findMostExpensiveAuto();
        assertTrue(result.isPresent());
        assertEquals(40000, result.get().getPrice(), 0.01);

    }

    @Test
    public void testFindMostExpensiveAutoEmpty() {
        Optional<Auto> result = testEmpty.findMostExpensiveAuto();
        assertTrue(result.isEmpty());
    }

    @Test
    public void testFindMostExpensiveAutoSingleElement() {
        Optional<Auto> result = testSingleElement.findMostExpensiveAuto();
        assertTrue(result.isPresent());
        assertEquals(15000, result.get().getPrice(), 0.01);
    }

    @Test
    public void testGroupByBrand() {
        Map<String, List<Auto>> result = task1.groupByBrand();
        assertEquals(4, result.size());
        assertEquals(2, result.get("Toyota").size());
    }

    @Test
    public void testGroupByBrandEmpty() {
        Map<String, List<Auto>> result = testEmpty.groupByBrand();
        assertTrue(result.isEmpty());
    }

    @Test
    public void testGroupByBrandSingleElement() {
        Map<String, List<Auto>> result = testSingleElement.groupByBrand();
        assertEquals(1, result.size());
    }

    @Test
    public void testCountByBrand() {
        Map<String,Long> result = task1.countByBrand();
        assertEquals(2, (long) result.get("Toyota"));
        assertEquals(1, (long)result.get("Ford"));
    }

    @Test
    public void testCountByBrandEmpty() {
        Map<String,Long> result = testEmpty.countByBrand();
        assertTrue(result.isEmpty());
    }

    @Test
    public void testCountByBrandSingleElement() {
        Map<String,Long> result = testSingleElement.countByBrand();
        assertEquals(1, (long)result.get("Mazda"));
        assertEquals(1, result.size());
    }

}
