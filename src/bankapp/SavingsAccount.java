/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bankapp;

/**
 *
 * @author lab_services_student
 */
public class SavingsAccount implements Account {
    private double balance;
    private final double interestRate; // as percentage e.g., 5 = 5%

    public SavingsAccount(double balance, double interestRate) {
        this.balance = balance;
        this.interestRate = interestRate;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + ". New balance: " + balance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew " + amount + ". New balance: " + balance);
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    @Override
    public double calculateInterest() {
        double interest = balance * (interestRate / 100);
        System.out.println("Interest earned: " + interest);
        return interest;
    }

    @Override
    public void viewBalance() {
        System.out.println("Savings Account balance: " + balance);
    }
}

