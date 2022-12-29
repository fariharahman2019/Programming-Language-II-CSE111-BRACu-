/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fariha
 */
public class BankAccount2 {

    public String name;
    public String address;
    public String accountID;
    public double balance;

    public BankAccount2(String n, String a, String i, double b) {
        name = n;
        address = a;
        accountID = i;
        balance = b;

    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

    public String getAccountID() {
        return accountID;
    }

    public void setAccountID(String i) {
        accountID = i;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String a) {
        address = a;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double b) {
        balance = b;
    }

    public void addInterest() {
        double interest = (balance * 7.0) / 100.0;
        balance = balance + interest;
    }
}
