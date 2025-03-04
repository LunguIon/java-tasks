package com.learn.task1;

import java.util.*;
import java.util.stream.Collectors;

public class Task1 {
    private final List<Auto> autos;

    public Task1(List<Auto> autos) {
        this.autos = List.copyOf(autos); // Ensures immutability
    }

    public List<Auto> filterByPrice(double minPrice) {
        return autos.stream().filter(auto -> auto.getPrice() >= minPrice).toList();
    }

    public List<Auto> sortByPrice() {
        return autos.stream().sorted(Comparator.comparingDouble(Auto::getPrice)).toList();
    }

    public Optional<Double> findMostCommonPrice() {
        return autos.stream()
                .collect(Collectors.groupingBy(Auto::getPrice, Collectors.counting()))
                .entrySet().stream()
                .max(Comparator.comparingLong(Map.Entry::getValue))
                .map(Map.Entry::getKey);
    }

    public Optional<Auto> findMostExpensiveAuto() {
        return autos.stream().max(Comparator.comparingDouble(auto -> auto.price));
    }


    public Map<String,List<Auto>> groupByBrand() {
        return autos.stream()
                .collect(Collectors.groupingBy(Auto::getBrand));

    }

    public Map<String,Long>  countByBrand() {
        return autos.stream()
                .collect(Collectors.groupingBy(Auto::getBrand,Collectors.counting()));

    }


}
