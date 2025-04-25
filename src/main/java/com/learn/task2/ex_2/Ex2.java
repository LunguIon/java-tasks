package com.learn.task2.ex_2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.security.SecureRandom;
import java.util.*;
import java.util.stream.Stream;


public class Ex2 {
    String filePath = "src/main/java/com/learn/task2/ex_2/makes.txt";
    String make;
    VehicleFactory factory;
    SecureRandom secureRandom = new SecureRandom();

    public String setUp() {
         try(Stream<String> lines = Files.lines(Path.of(filePath))) {
             List<String> makesList = lines.toList();
             if(!makesList.isEmpty()){
            this.make = makesList.get(secureRandom.nextInt(0, makesList.size()));
            this.factory = new VehicleFactory(make);
            return "the file was read successfully";
             }else{
                 return "the file is empty";
             }

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
