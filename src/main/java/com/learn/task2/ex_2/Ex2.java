package com.learn.task2.ex_2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.stream.Stream;


public class Ex2 {
    String filePath = "src/main/java/com/learn/task2/ex_2/makes.txt";
    String make;
    VehicleFactory factory;

    public String setUp() {
         try(Stream<String> lines = Files.lines(Path.of(filePath))) {
             List<String> makesList = lines.toList();
            this.make = makesList.get(new Random().nextInt(0, makesList.size()));
            factory = new VehicleFactory(make);
            return "the file was read successfully";
        }
        catch(IOException e) {
            return "some problem occurred";
        }

    }

    public String getMake() {
        return this.make;
    }

    public Car runCar() {
        return factory.getCar();
    }

    public Truck runTruck() {
        return factory.getTruck();
    }

    public Motorcycle runMotorcycle() {
        return factory.getMotorcycle();
    }


}
