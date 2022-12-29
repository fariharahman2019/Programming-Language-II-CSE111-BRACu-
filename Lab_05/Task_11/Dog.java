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
public class Dog {
     private String color = "Black";
    
    public Dog(String c)
    {
        color = c;
    }
    public void setColor(String c)
    {
        color = c;
    }
    public void changeColor(String c)
    {
        color = c;
    }
    public void bark()
    {
        System.out.println(color+" dog is barking ");
    }

}
