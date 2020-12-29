package ru.job4j.oop.Inheritance;

import java.util.Date;

public class Surgeon extends Doctor {

    private int operationQuantity;

    public Surgeon(String name, String surname, String education, Date birthday, String specalisation, String degree) {
        super(name, surname, education, birthday, specalisation, degree);
    }

    public void doOperation(Patient patient) {

    }

}
