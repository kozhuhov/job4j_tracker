package ru.job4j.oop.inheritance;

import java.util.Date;

public class Engineer extends Profession {

    private boolean hasCertificate;

    public Engineer(String name, String surname, String education, Date birthday) {
        super(name, surname, education, birthday);
    }
}
