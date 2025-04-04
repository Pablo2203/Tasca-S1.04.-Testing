package org.example.level2.allExercises;

public class Car {
    private String model;
    private String color;
    private int year;


    public Car(String model, String color, int year) {
        this.model = model;
        this.color = color;
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }
    public Car getCar(){
        return this;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Car car = (Car) obj;
        return model.equals(car.model);
    }
    @Override
    public int hashCode() {
        return model.hashCode();
    }
}
