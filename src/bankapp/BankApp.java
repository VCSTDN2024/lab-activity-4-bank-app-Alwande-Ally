/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bankapp;

/**
 *
 * @author lab_services_student
 */


import java.util.Scanner;

public class BankApp {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Bank bank = new Bank();
            
            // Create sample accounts
            SavingsAccount savings = new SavingsAccount(1000, 5);  // balance = 1000, interest = 5%
            CurrentAccount current = new CurrentAccount(2000, 500); // balance = 2000, overdraft = 500
            
            // Add accounts to bank
            bank.addAccount(savings);
            bank.addAccount(current);
            
            int choice;
            do {
                System.out.println("\n=== BANK MENU ===");
                System.out.println("1. Deposit");
                System.out.println("2. Withdraw");
                System.out.println("3. Calculate Interest (Savings Only)");
                System.out.println("4. View Balance");
                System.out.println("5. Show All Accounts");
                System.out.println("0. Exit");
                System.out.print("Enter your choice: ");
                choice = scanner.nextInt();
                
                switch (choice) {
                    case 1 -> {
                        // Deposit
                        System.out.println("Select Account: 1. Savings  2. Current");
                        int depAcc = scanner.nextInt();
                        System.out.print("Enter amount to deposit: ");
                        double depAmount = scanner.nextDouble();
                        if (depAcc == 1) {
                            bank.deposit(savings, depAmount);
                        } else {
                            bank.deposit(current, depAmount);
                        }
                    }
                        
                    case 2 -> {
                        // Withdraw
                        System.out.println("Select Account: 1. Savings  2. Current");
                        int witAcc = scanner.nextInt();
                        System.out.print("Enter amount to withdraw: ");
                        double witAmount = scanner.nextDouble();
                        if (witAcc == 1) {
                            bank.withdraw(savings, witAmount);
                        } else {
                            bank.withdraw(current, witAmount);
                        }
                    }
                        
                    case 3 -> // Interest (Savings only)
                        savings.calculateInterest();
                        
                    case 4 -> {
                        // View Balance
                        System.out.println("Select Account: 1. Savings  2. Current");
                        int balAcc = scanner.nextInt();
                        if (balAcc == 1) {
                            savings.viewBalance();
                        } else {
                            current.viewBalance();
                        }
                    }
                        
                    case 5 -> // Show all accounts
                        bank.showAllAccounts();
                        
                    case 0 -> System.out.println("Exiting... Thank you for using BankApp!");
                        
                    default -> System.out.println("Invalid choice. Try again.");
                }
            } while (choice != 0);
        }
    }
}


