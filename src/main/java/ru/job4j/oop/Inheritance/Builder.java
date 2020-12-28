package ru.job4j.oop.Inheritance;

public class Builder extends Engineer {

    private int HouseQuantity;

    public House buildHouse() {
        return new House();
    }

}
