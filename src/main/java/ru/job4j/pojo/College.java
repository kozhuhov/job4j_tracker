package ru.job4j.pojo;

import java.time.LocalDate;

public class College {

    public static void main(String[] args) {
        Student vasya = new Student();
        vasya.setName("Vasya");
        vasya.setGroup(3);
        vasya.setBirthday(LocalDate.of(1981, 5, 5));

        String desc = "name: " + vasya.getName() + " group: " + vasya.getGroup() + " birthday: " + vasya.getBirthday();
        System.out.println(desc);
    }

}
