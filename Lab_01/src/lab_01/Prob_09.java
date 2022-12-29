/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_01;

import java.util.Scanner;

/**
 *
 * @author 19101038
 */
public class Prob_09 {
    public static void main(String[]args)
            {
                Scanner sc = new Scanner(System.in);
                System.out.println("Please enter any number");
                int n = sc.nextInt();
                for (int row = n; row>0; row--)
                {
                    for(int column=1; column<=n; column++)
                    {
                        if(row==1 || column==row || column==n)
                            {
                            System.out.print(column);
                            }
                            else
                            {
                                System.out.print(" ");
                            }
                    }
                    System.out.println();
                }
            }
    
}
