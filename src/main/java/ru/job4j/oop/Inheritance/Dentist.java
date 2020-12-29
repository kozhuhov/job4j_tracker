package ru.job4j.oop.Inheritance;

import java.util.Date;

public class Dentist extends Doctor {

    private int deletedTeeth;

    public Dentist(String name, String surname, String education, Date birthday, String specalisation, String degree) {
        super(name, surname, education, birthday, specalisation, degree);
    }

    public void deleteTeeth(Patient patient) {
        deletedTeeth++;
    }
}
