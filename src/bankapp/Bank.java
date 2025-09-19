/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bankapp;

/**
 *
 * @author lab_services_student
 */

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private final List<Account> accounts;

    public Bank() {
        accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
        System.out.println("Account added successfully.");
    }

    public void removeAccount(Account account) {
        accounts.remove(account);
        System.out.println("Account removed successfully.");
    }

    public void deposit(Account account, double amount) {
        account.deposit(amount);
    }

    public void withdraw(Account account, double amount) {
        account.withdraw(amount);
    }

    public void showAllAccounts() {
        for (Account acc : accounts) {
            acc.viewBalance();
        }
    }
}

