/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bankapp;

/**
 *
 * @author lab_services_student
 */
public interface Account {
    void deposit(double amount);
    void withdraw(double amount);
    double calculateInterest();
    void viewBalance();
}
