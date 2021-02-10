package ru.job4j.collection;

import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class User implements Comparable<User> {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int compareTo(User o) {
        if (name.equals(o.getName())) {
            return Integer.compare(age, o.getAge());
        }

        return name.compareTo(o.getName());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        User user = (User) o;
        return age == user.age
                && Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "User{"
                + "name='" + name + '\''
                + ", age=" + age
                + '}';
    }

    public static void main(String[] args) {
        Set<User> users = new TreeSet<User>();
        users.add(new User("Bob", 30));
        users.add(new User("Jack", 25));
        users.add(new User("Jack", 26));
        users.add(new User("Max", 31));

        System.out.println(users);
    }

}