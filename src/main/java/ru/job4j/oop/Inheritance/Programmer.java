package ru.job4j.oop.Inheritance;

public class Programmer extends Engineer{

    private String language;

    public Algoritm createAlgo() {
        return new Algoritm();
    }

}
