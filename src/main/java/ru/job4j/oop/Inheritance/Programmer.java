package ru.job4j.oop.Inheritance;

import java.util.Date;

public class Programmer extends Engineer{

    private String language;

    public Programmer(String name, String surname, String education, Date birthday) {
        super(name, surname, education, birthday);
    }

    public Algoritm createAlgo() {
        return new Algoritm();
    }

}
