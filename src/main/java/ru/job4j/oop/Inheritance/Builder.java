package ru.job4j.oop.Inheritance;

import java.util.Date;

public class Builder extends Engineer {

    private int houseQuantity;

    public Builder(String name, String surname, String education, Date birthday) {
        super(name, surname, education, birthday);
    }

    public House buildHouse() {
        houseQuantity++;
        return new House();
    }

}
