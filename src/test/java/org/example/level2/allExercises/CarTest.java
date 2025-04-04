package org.example.level2.allExercises;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import java.util.*;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.*;

public class CarTest {
    Car car;
    Car car2;
    Car car3;
    Car car4;
    Car car5;
    List<Car> cars;
    @BeforeEach
    public void setUp() {
        car5 = new Car("Audi","Black",2020); //EXERCISE4

        this.cars = List.of( car = new Car("BMW", "Blue", 2020),
        car2 = new Car("Mercedes", "Red", 2019),
        car3 = new Car("Mercedes", "White", 2019),
        car4 = new Car("BMW", "Blue", 2020));

    }
    @Test
    public void testCarsYear(){ //EXERCISE1
        assertThat(car2.getYear()).isEqualTo(car3.getYear());
        assertThat(car.getYear()).isNotEqualTo(car2.getYear());
    }
    @Test
    public void testCarsModel(){ //EXERCISE2
        assertThat(car.getModel()).isSameAs(car4.getModel());
        assertThat(car.getModel()).isNotSameAs(car2.getModel());}
    @Test
    public void testCarsYearDifferentLists() { //EXERCISE3
        List<Car> cars2 = List.of(
                new Car("Volvo", "Blue", 2020),
                new Car("Mercedes", "Yellow", 2019),
                new Car("Toyota", "White", 2019),
                new Car("Tesla", "Blue", 2020)
        );


        assertThat(getYears(this.cars)).containsExactlyInAnyOrderElementsOf(getYears(cars2));
    }
    //Perdón por esto, sé que queda horrible. Lo hice para no crear tantas clases para los ejercicios.
    private static List<Integer> getYears(List<Car> cars) {
            return cars.stream()
                    .map(Car::getYear)
                    .toList();
        }
    @Test
    public void testArrayListOrder(){ //EXERCISE4
        assertThat(cars).containsExactlyInAnyOrder(car,car2,car3,car4);
        assertThat(cars).containsOnlyOnce(car);
        assertThat(cars).doesNotContain(car5);

    }

    @Test
    public void testMap(){ //EXERCISE5
        Map<String, Integer> carsMap = cars.stream()
                .collect(Collectors.toMap(Car::getModel, Car::getYear, (existing, replacement) -> existing));
        assertThat(carsMap).containsKey("BMW");

    }
    @Test
    public void testExceptionArray(){ //EXERCISE6
        assertThatIndexOutOfBoundsException().isThrownBy(() -> cars.get(10));
    }
    @Test
    public void testEmptyOptional(){ //EXERCISE7
        Optional<String> optional = Optional.empty();
        assertThat(optional.isEmpty());

    }



}
