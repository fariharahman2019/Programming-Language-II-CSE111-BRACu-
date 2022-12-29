/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fariha
 */
public class TestBankAccount {

    public static void main(String[] args) {

        BankAccount acc1 = new BankAccount();
        BankAccount acc2 = new BankAccount();
        BankAccount acc3 = new BankAccount();

        acc1.setName("Fariha Rahman");
        acc1.setAddress("Banani");
        acc1.setAccountID("19101038");
        acc1.setBalance(500000.00);

        acc2.setName("Mahadi Mollah");
        acc2.setAddress("Banasree");
        acc2.setAccountID("19101040");
        acc2.setBalance(10000.00);

        acc3.setName("Ali Asgar");
        acc3.setAddress("Wari");
        acc3.setAccountID("19101363");
        acc3.setBalance(1000.00);

        acc1.addInterest();
        acc3.addInterest();

        System.out.println(acc1.getName());
        System.out.println(acc1.getAccountID());
        System.out.println(acc1.getAddress());
        System.out.println(acc1.getBalance());
        System.out.println();

        System.out.println(acc2.getName());
        System.out.println(acc2.getAccountID());
        System.out.println(acc2.getAddress());
        System.out.println(acc2.getBalance());
        System.out.println();

        System.out.println(acc3.getName());
        System.out.println(acc3.getAccountID());
        System.out.println(acc3.getAddress());
        System.out.println(acc3.getBalance());
        System.out.println();
    }
}
