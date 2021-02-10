package ru.job4j.oop.inheritance;

import java.util.Date;

public class Surgeon extends Doctor {

    private int operationQuantity;

    public Surgeon(String n, String sn, String edu, Date birth, String spec, String degree) {
        super(n, sn, edu, birth, spec, degree);
    }

    public void doOperation(Patient patient) {

    }

}
