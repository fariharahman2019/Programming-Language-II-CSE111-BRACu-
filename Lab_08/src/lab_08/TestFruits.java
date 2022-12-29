/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_08;

/**
 *
 * @author 19101038
 */
public class TestFruits {
    public static void testFruit(Fruit f){
        System.out.println("----Printing Detail-----");
        if(f.hasFormalin()){      
            System.out.println("Do not eat the "+f.getName()+".");
            System.out.println(f);
        }else{

            System.out.println("Eat the "+f.getName()+".");
            System.out.println(f);
        }
    }  
    public static void main(String [] args){
        Mango m = new Mango();
        testFruit(m);
        Jackfruit j = new Jackfruit();
        testFruit(j);
    }
}