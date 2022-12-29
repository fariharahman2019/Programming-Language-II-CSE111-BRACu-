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
public class PersonTester{
    public static void main(String[] args)
    {
        Employee e1 = new Employee("Fariha", 5000.00, 3, "19101038");
        Employee e2 = new Employee("Furqan", 10000.00, 4, "19101038");
        e1.print();
        e2.print();
        e1.equals(e2);
    }
}
