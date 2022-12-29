/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_01;

/**
 *
 * @author 19101038
 */
import java.util.Scanner;
public class Prob_13 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter any number");
        int n = sc.nextInt();
        for (int row = 1; row <= n; row++) 
        {
            System.out.print(row);
        }
        for (int row = n-1; row >0; row--) 
        {
            System.out.print(row);
        }
        System.out.println();

        // TODO code application logic here
    }
    
}
