package org.example.level2.allExercises;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
    Car car = new Car("BMW", "Blue", 2020);
    Car car2 = new Car("Mercedes", "Red", 2019);
    Car car3 = new Car("Mercedes", "White", 2019);
    Car car4 = new Car("BMW", "Blue", 2017);

    List<Car> cars = new ArrayList<>();
    cars.add(car);
    cars.add(car2);
    cars.add(car3);
    cars.add(car4);

    cars.forEach(System.out::println);
    }
}
