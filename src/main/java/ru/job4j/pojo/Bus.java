package ru.job4j.pojo;

public class Bus implements Transport{

    private int passengersCount;

    @Override
    public void drive() {
        System.out.println("drive");
    }

    @Override
    public void passengers(int passengersCount) {
        this.passengersCount = passengersCount;
    }

    @Override
    public double fill(int fuelCount) {
        double price = 45.99;
        return fuelCount * price;
    }
}
