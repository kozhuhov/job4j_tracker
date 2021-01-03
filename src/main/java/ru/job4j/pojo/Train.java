package ru.job4j.pojo;

public class Train implements Vehicle {
    @Override
    public void move() {
        System.out.println("Поезд едет по железной дороге");
    }
}
