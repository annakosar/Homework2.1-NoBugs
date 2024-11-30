package org.example.task5;

public class Car implements Drivable, Displayable {
    private String brand;
    private String model;
    private int year;

    public void setBrand (String brand) {
        this.brand = brand;
    }
    public void setModel (String model) {
        this.model = model;
    }
    public void setYear (int year) {
        this.year = year;
    }

    public String getBrand () {
        return this.brand;
    }
    public String getModel () {
        return this.model;
    }
    public int getYear () {
        return this.year;
    }

    @Override
    public void start() {
        System.out.println("Автомобиль тронулся.");

    }

    @Override
    public void stop() {
        System.out.println("Автомобиль остановился.");

    }

    @Override
    public void drive() {
        System.out.println("Автомобиль едет.");
    }

    @Override
    public void display() {
        System.out.println("Автомобиль: " + this.brand + " " + this.model + ", " + this.year);
    }
}
