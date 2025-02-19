package com.learn.task1;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Task1 {
    private final List<Auto> autos;

    public Task1(List<Auto> autos) {
        this.autos = List.copyOf(autos); // Ensures immutability
    }

    public List<Auto> filterByPrice(double minPrice) {
        return autos.stream().filter(auto -> auto.getPrice() >= minPrice).collect(Collectors.toList());
    }

    public List<Auto> sortByPrice() {
        return autos.stream().sorted(Comparator.comparingDouble(Auto::getPrice)).collect(Collectors.toList());
    }

    public Optional<Double> mostCommonPrice() {
        return autos.stream()
                .collect(Collectors.groupingBy(Auto::getPrice, Collectors.counting()))
                .entrySet().stream()
                .max(Comparator.comparingLong(Map.Entry::getValue))
                .map(Map.Entry::getKey);
    }
}
