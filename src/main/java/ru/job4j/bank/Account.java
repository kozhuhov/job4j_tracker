package ru.job4j.bank;

import java.util.Objects;

/**
 * Класс описывает банковский счет
 * @author Dmitry Kozhukhov
 * @version 1.0
 */
public class Account {
    private String requisite;
    private double balance;

    public Account(String requisite, double balance) {
        this.requisite = requisite;
        this.balance = balance;
    }

    /**
     * Метод возвращает реквизиты банк. счета
     * @return возвращает строковое представление реквизитов
     */
    public String getRequisite() {
        return requisite;
    }

    /**
     * Метод записывает реквизиты банк. счета
     */
    public void setRequisite(String requisite) {
        this.requisite = requisite;
    }

    /**
     * Метод возвращает баланс банк. счета
     * @return возвращает баланс в виде числа с плавающей точкой
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Метод записывает баланс банк. счета
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Account account = (Account) o;
        return Objects.equals(requisite, account.requisite);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requisite);
    }
}