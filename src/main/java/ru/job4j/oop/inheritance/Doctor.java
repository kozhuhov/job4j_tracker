package ru.job4j.oop.inheritance;

import java.util.Date;

public class Doctor extends Profession {

    private String specalisation;
    private String degree;

    public Doctor(String n, String sn, String edu, Date birth, String spec, String degree) {
        super(n, sn, edu, birth);
        this.specalisation = spec;
        this.degree = degree;
    }
}
