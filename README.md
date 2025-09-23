[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/lA6JrJDS)

# BankApp

A Java console-based banking system built in NetBeans for Lab Activity 4.

## Description
This project implements a simple banking system with the following classes:

- **Account (Interface)**: Defines the core methods `deposit`, `withdraw`, `calculateInterest`, and `viewBalance`.
- **SavingsAccount**: Implements `Account`, has `balance` and `interestRate`, and supports interest calculation.
- **CurrentAccount**: Implements `Account`, has `balance` and `overdraftLimit`.
- **Bank**: Manages multiple accounts with methods to add/remove accounts, deposit, withdraw, and view balances.
- **BankApp**: Contains the `main` method and a console menu to test all functionality.

## Features
- Create Savings and Current accounts
- Deposit and withdraw money
- Calculate interest for Savings accounts
- View balances for individual or all accounts
- Console-based interactive menu

## How to Run

### NetBeans
1. Open NetBeans → File → Open Project → select the `BankApp` folder.
2. Right-click the project → Run.

### Command Line
From the project root directory:
```bash
javac -d build/classes src/bankapp/*.java
java -cp build/classes bankapp.BankApp
```
#Menu Example
---

=== BANK MENU ===
1. Deposit
2. Withdraw
3. Calculate Interest (Savings Only)
4. View Balance
5. Show All Accounts
0. Exit
Enter your choice:

#  Project Structure
---
```
src/
  bankapp/
    Account.java
    SavingsAccount.java
    CurrentAccount.java
    Bank.java
    BankApp.java
.gitignore
README.md
```

# Author
---

Alwande Ally

                                                      






