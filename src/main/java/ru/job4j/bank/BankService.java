package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Класс описывает банковский сервис
 * @author Dmitry Kozhukhov
 * @version 1.0
 */
public class BankService {
    /**
     * список пользователей сервиса
     */
    private Map<User, List<Account>> users = new HashMap<>();

    /**
     * Метод добавляет пользователя в список пользователей банк. сервиса
     * @param user ссылка на пользователя
     */
    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<Account>());
    }

    /**
     * Метод добавляет банковский счет для пользователя
     * В случае, если счет уже привязан к пользователю, метод ничего не делает
     * @param passport паспортные данные пользователя, используются для идентификации пользователя
     * @param account банковский счет
     */
    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> accounts = users.get(user);
            if (!accounts.contains(account)) {
                accounts.add(account);
            }
        }
    }

    /**
     * Метод ищет пользователя в банковском сервисе по паспортным данным
     * @param passport паспорные данные пользователя
     * @return пользователь
     */
    public User findByPassport(String passport) {
        for (User user : users.keySet()) {
            if (user.getPassport().equals(passport)) {
                return user;
            }
        }
        return null;
    }

    /**
     * Метод ищет банковский счет по паспортным данным пользователя и реквизитам счета
     * @param passport паспортные данные пользователя
     * @param requisite реквизиты счета
     * @return банковский счет
     */
    public Account findByRequisite(String passport, String requisite) {
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> accounts = users.get(user);
            for (Account account : accounts) {
                if (account.getRequisite().equals(requisite)) {
                    return account;
                }
            }
        }
        return null;
    }

    /**
     * Метод отвечает за перевод денежных средств
     * @param srcPassport паспортные данные отправителя
     * @param srcRequisite реквизиты отправителя
     * @param destPassport паспортные данные получателя
     * @param destRequisite реквизиты получателя
     * @param amount сумма денежных средств
     * @return признак успешного выполнения операции
     */
    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {

        Account srcAccount = findByRequisite(srcPassport, srcRequisite);
        Account destAccount = findByRequisite(destPassport, destRequisite);
        if (srcAccount == null || srcAccount.getBalance() < amount
            || destAccount == null) {
            return false;
        }
        srcAccount.setBalance(srcAccount.getBalance() - amount);
        destAccount.setBalance(destAccount.getBalance() + amount);
        return true;
    }
}