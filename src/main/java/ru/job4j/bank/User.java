package ru.job4j.bank;

import java.util.Objects;

/**
 * Класс описывает пользователя банковского сервиса
 * @author Dmitry Kozhukhov
 * @version 1.0
 */
public class User {
    /**
     * паспортные данные
     */
    private String passport;
    /**
     * имя пользователя
     */
    private String username;

    public User(String passport, String username) {
        this.passport = passport;
        this.username = username;
    }

    /**
     * Метод возвращает паспортные данные пользователя
     * @return возвращает строковое представление паспортных данных
     */
    public String getPassport() {
        return passport;
    }

    /**
     * Метод записывает паспортные данные пользователя
     */
    public void setPassport(String passport) {
        this.passport = passport;
    }

    /**
     * Метод возвращает имя пользователя
     * @return возвращает строку с именем пользователя
     */
    public String getUsername() {
        return username;
    }

    /**
     * Метод записывает имя пользователя
     */
    public void setUsername(String username) {
        this.username = username;
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
        return Objects.equals(passport, user.passport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(passport);
    }
}