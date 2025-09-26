[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/lA6JrJDS)

# BankApp

A Java console-based banking system developed for **Lab Activity 4**. This project demonstrates object-oriented programming concepts including interfaces, inheritance, and polymorphism.

---

## Description
BankApp implements a simple banking system with the following features:

- **Account (Interface):** Defines the core banking operations:
  - `deposit(double amount)`
  - `withdraw(double amount)`
  - `calculateInterest()` (for savings accounts)
  - `viewBalance()`

- **SavingsAccount:** Implements `Account` and supports interest calculation.  
  Fields: `balance`, `interestRate`.

- **CurrentAccount:** Implements `Account` with an overdraft facility.  
  Fields: `balance`, `overdraftLimit`.

- **Bank:** Manages multiple accounts and provides methods to:
  - Add/Remove accounts
  - Deposit/Withdraw money
  - View balances of all accounts

- **BankApp:** Console-based interface for testing and interacting with the banking system. Provides a menu-driven user experience.

---

## Features
- Create Savings and Current accounts
- Deposit and withdraw funds
- Calculate interest for Savings accounts
- View individual account balances
- Display all accounts in the bank
- Interactive console menu

---

## How to Run

### Using NetBeans
1. Open NetBeans → File → Open Project → select the `BankApp` folder.
2. Right-click the project → **Run**.

### Using Command Line
From the project root directory:

```bash
javac -d build/classes src/bankapp/*.java
java -cp build/classes bankapp.BankApp
```

# Menu Example
```
=== BANK MENU ===
1. Deposit
2. Withdraw
3. Calculate Interest (Savings Only)
4. View Balance
5. Show All Accounts
0. Exit
Enter your choice:
```

# Author
Alwande Ally
