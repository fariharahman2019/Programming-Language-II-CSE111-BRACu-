/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_05;

/**
 *
 * @author Fariha
 */
public class Account {
    public static double interestRate = 5.0;
  public String accountHolderName = "Default account";
  public double currentBalance = 0.0;
  
  public Account()
  { 
  }
  public Account(String n, double b)
  {
    accountHolderName = n;
    currentBalance = b;
  }
  public double balanceKi()
  {
    return currentBalance;
  }
  public String nameKi()
  {
    return accountHolderName;
  }
  public void nameBoshao(String name)
  {
    accountHolderName = name;
  }
  public void balanceBoshao(double balance)
  {
    currentBalance = balance;
  }
  public void withdraw(double money)
  {
    double newBalance;
    if(currentBalance>money && currentBalance-money>100)
    {
      newBalance = currentBalance - money;
      System.out.println("Withdraw successful! New balance is: "+newBalance);
    }
    else
    {
      System.out.println("The account balance after deducting withdraw amount is equal to or less than minimum. Cannot withdraw");
    }
  }
}
