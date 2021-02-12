package ru.job4j.oop.inheritance;

import java.util.Date;

public class Dentist extends Doctor {

    private int deletedTeeth;

    public Dentist(String n, String sn, String edu, Date birth, String spec, String degree) {
        super(n, sn, edu, birth, spec, degree);
    }

    public void deleteTeeth(Patient patient) {
        deletedTeeth++;
    }
}
