/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_07;

/**
 *
 * @author 19101038
 */

public class TestMyString {

    public static void main(String[] args) {
        
        // TASK 1
        
        MyString m1 = new MyString("Fariha Rahman");
        System.out.println(m1.length());
        
        //TASK 2
        
        System.out.println(m1.charAt(7));
        
        //TASK 3
        
        System.out.println(m1.startsWith("Fariha"));
        
        //TASK 4
        
        System.out.println(m1.endsWith("Rahman"));

        
    }
}
