package ru.job4j.oop.Inheritance;

import java.util.Date;

public class Doctor extends Profession {

    private String specalisation;
    private String degree;

    public Doctor(String name, String surname, String education, Date birthday, String specalisation, String degree) {
        super(name, surname, education, birthday);
        this.specalisation = specalisation;
        this.degree = degree;
    }
}
