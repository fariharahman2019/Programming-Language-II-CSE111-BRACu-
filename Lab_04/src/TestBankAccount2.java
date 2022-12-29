/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fariha
 */
public class TestBankAccount2 {

    public static void main(String[] args) {
        BankAccount2 acc1 = new BankAccount2("Fariha", "19101038", "Banani", 100.00);

        acc1.addInterest();
       
        System.out.println(acc1.getName());
        System.out.println(acc1.getAccountID());
        System.out.println(acc1.getAddress());
        System.out.println(acc1.getBalance());
        System.out.println();

        BankAccount2 acc2 = new BankAccount2("Mahadi", "19101040", "Banasree", 120.00);

        System.out.println(acc2.getName());
        System.out.println(acc2.getAccountID());
        System.out.println(acc2.getAddress());
        System.out.println(acc2.getBalance());
        System.out.println();

        BankAccount2 acc3 = new BankAccount2("Tamjid", "19101363", "Wari", 20.00);

        acc3.addInterest();
        
        System.out.println(acc3.getName());
        System.out.println(acc3.getAccountID());
        System.out.println(acc3.getAddress());
        System.out.println(acc3.getBalance());
        System.out.println();

    }

}
