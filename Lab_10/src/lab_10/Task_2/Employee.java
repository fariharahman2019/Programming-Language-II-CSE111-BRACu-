/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_10.Task_2;

/**
 *
 * @author 19101038
 */
public class Employee extends Person{
    public Employee()
    {
    }
    
    public Employee(String n, double s, int y, String _nin)
    {
        setName(n);
        setSalary(s);
        setYear(y);
        setNin(_nin);
    }
    
    public void print()
    {
        System.out.println("Name : "+getName());
        System.out.println("Salary : "+getSalary());
        System.out.println("Has been working for : "+getYear()+" years");
        System.out.println("National Insurance Number : "+getNin());
        System.out.println("------------------------------------");
        System.out.println("------------------------------------");
    }
}
