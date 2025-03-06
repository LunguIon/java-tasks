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
    private Task1 justCar;
    private Task1 justTruck;

    @Before
    public void setUp() {
        List<Auto> autos = createAutos();
        List<Auto> cars = createCars();
        List<Auto> trucks = createTrucks();

        task1 = new Task1(autos);
        justCar = new Task1(cars);
        justTruck = new Task1(trucks);
    }

    private List<Auto> createAutos() {
        return Arrays.asList(
                new Car("Toyota", 20000),
                new Car("Honda", 22000),
                new Truck("Ford", 35000),
                new Car("Toyota", 20000),
                new Truck("Chevrolet", 40000)
        );
    }

    private List<Auto> createCars() {
        return Arrays.asList(
                new Car("Toyota", 20000),
                new Car("Honda", 22000),
                new Car("Toyota", 20000),
                new Car("Mazda", 15000)
        );
    }

    private List<Auto> createTrucks() {
        return Arrays.asList(
                new Truck("Toyota", 35000),
                new Truck("Chevrolet", 40000),
                new Truck("Toyota", 22000),
                new Truck("Mercedes", 35000)
        );
    }

    @Test
    public void testFilterByPrice() {
        List<Auto> result = task1.filterByPrice(25000);
        assertEquals(2, result.size());
    }

    @Test
    public void testFilterByPriceCars() {
        List<Auto> result = justCar.filterByPrice(18000);
        assertEquals(3, result.size());
    }

    @Test
    public void testFilterByPriceTruck() {
        List<Auto> result = justTruck.filterByPrice(25000);
        assertEquals(3, result.size());
    }

    @Test
    public void testFilterByPriceEmpty() {
        Task1 emptyTask = new Task1(Collections.emptyList());
        List<Auto> result = emptyTask.filterByPrice(1);
        assertEquals(0, result.size());
    }

    @Test
    public void testFilterByPriceSingleElement() {
        Task1 singleElementTask = new Task1(List.of(new Car("Mazda", 15000)));
        List<Auto> result = singleElementTask.filterByPrice(10000);
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
    public void testSortByPriceCars() {
        List<Auto> result = justCar.sortByPrice();
        assertEquals(15000, result.getFirst().getPrice(), 0.01);
        assertEquals(22000, result.getLast().getPrice(), 0.01);
    }

    @Test
    public void testSortByPriceTruck() {
        List<Auto> result = justTruck.sortByPrice();
        assertEquals(22000, result.getFirst().getPrice(), 0.01);
        assertEquals(40000, result.getLast().getPrice(), 0.01);
    }

    @Test
    public void testSortByPriceEmpty() {
        Task1 emptyTask = new Task1(Collections.emptyList());
        List<Auto> result = emptyTask.sortByPrice();
        assertEquals(0, result.size());
    }

    @Test
    public void testSortByPriceSingleElement() {
        Task1 singleElementTask = new Task1(List.of(new Car("Mazda", 15000)));
        List<Auto> result = singleElementTask.sortByPrice();
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
    public void testFindMostCommonPriceCar() {
        Optional<Double> result = justCar.findMostCommonPrice();
        assertTrue(result.isPresent());
        assertEquals(20000, result.get(), 0.01);
    }

    @Test
    public void testFindMostCommonPriceTruck() {
        Optional<Double> result = justTruck.findMostCommonPrice();
        assertTrue(result.isPresent());
        assertEquals(35000, result.get(), 0.01);
    }

    @Test
    public void testFindMostCommonPriceEmpty() {
        Task1 emptyTask = new Task1(Collections.emptyList());
        Optional<Double> result = emptyTask.findMostCommonPrice();
        assertTrue(result.isEmpty());
    }

    @Test
    public void testFindMostCommonPriceSingleElement() {
        Task1 singleElementTask = new Task1(List.of(new Car("Mazda", 15000)));
        Optional<Double> result = singleElementTask.findMostCommonPrice();
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
    public void testFindMostExpensiveCar() {
        Optional<Auto> result = justCar.findMostExpensiveAuto();
        assertTrue(result.isPresent());
        assertEquals(22000, result.get().getPrice(), 0.01);
    }

    @Test
    public void testFindMostExpensiveTruck() {
        Optional<Auto> result = justTruck.findMostExpensiveAuto();
        assertTrue(result.isPresent());
        assertEquals(40000, result.get().getPrice(), 0.01);
    }

    @Test
    public void testFindMostExpensiveAutoEmpty() {
        Task1 emptyTask = new Task1(Collections.emptyList());
        Optional<Auto> result = emptyTask.findMostExpensiveAuto();
        assertTrue(result.isEmpty());
    }

    @Test
    public void testFindMostExpensiveAutoSingleElement() {
        Task1 singleElementTask = new Task1(List.of(new Car("Mazda", 15000)));
        Optional<Auto> result = singleElementTask.findMostExpensiveAuto();
        assertTrue(result.isPresent());
        assertEquals(15000, result.get().getPrice(), 0.01);
    }

    @Test
    public void testFindMostExpensiveAutoMultipleCases() {
        Task1 multipleCasesTask = new Task1(List.of(
                new Car("Chevrolet", 35000),
                new Car("Lexus", 35000)
        ));
        Optional<Auto> result = multipleCasesTask.findMostExpensiveAuto();
        assertTrue(result.isPresent());
        assertEquals(35000, result.get().getPrice(), 0.01);
    }

    @Test
    public void testGroupByBrand() {
        Map<String, List<Auto>> result = task1.groupByBrand();
        assertEquals(4, result.size());
        assertEquals(2, result.get("Toyota").size());
    }

    @Test
    public void testGroupByBrandCar() {
        Map<String, List<Auto>> result = justCar.groupByBrand();
        assertEquals(3, result.size());
        assertEquals(2, result.get("Toyota").size());
    }

    @Test
    public void testGroupByBrandTruck() {
        Map<String, List<Auto>> result = justTruck.groupByBrand();
        assertEquals(3, result.size());
        assertEquals(2, result.get("Toyota").size());
    }

    @Test
    public void testGroupByBrandEmpty() {
        Task1 emptyTask = new Task1(Collections.emptyList());
        Map<String, List<Auto>> result = emptyTask.groupByBrand();
        assertTrue(result.isEmpty());
    }

    @Test
    public void testGroupByBrandSingleElement() {
        Task1 singleElementTask = new Task1(List.of(new Car("Mazda", 15000)));
        Map<String, List<Auto>> result = singleElementTask.groupByBrand();
        assertEquals(1, result.size());
    }

    @Test
    public void testCountByBrand() {
        Map<String, Long> result = task1.countByBrand();
        assertEquals(2, result.get("Toyota").longValue());
        assertEquals(1, result.get("Ford").longValue());
    }

    @Test
    public void testCountByBrandCar() {
        Map<String, Long> result = justCar.countByBrand();
        assertEquals(2, result.get("Toyota").longValue());
        assertEquals(1, result.get("Honda").longValue());
    }

    @Test
    public void testCountByBrandTruck() {
        Map<String, Long> result = justTruck.countByBrand();
        assertEquals(2, result.get("Toyota").longValue());
        assertEquals(1, result.get("Mercedes").longValue());
    }

    @Test
    public void testCountByBrandEmpty() {
        Task1 emptyTask = new Task1(Collections.emptyList());
        Map<String, Long> result = emptyTask.countByBrand();
        assertTrue(result.isEmpty());
    }

    @Test
    public void testCountByBrandSingleElement() {
        Task1 singleElementTask = new Task1(List.of(new Car("Mazda", 15000)));
        Map<String, Long> result = singleElementTask.countByBrand();
        assertEquals(1, result.get("Mazda").longValue());
        assertEquals(1, result.size());
    }
}