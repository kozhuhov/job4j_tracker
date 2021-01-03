package ru.job4j.pojo;

public interface Vehicle {

    void move();

    static void main(String[] args) {
        Vehicle airplane = new Airplane();
        Vehicle train = new Train();
        Vehicle bus = new Bus();

        Vehicle[] vehicles = new Vehicle[3];
        vehicles[0] = airplane;
        vehicles[1] = train;
        vehicles[2] = bus;

        for (Vehicle vehicle : vehicles) {
            vehicle.move();
            System.out.println(vehicle);
        }

    }

}
