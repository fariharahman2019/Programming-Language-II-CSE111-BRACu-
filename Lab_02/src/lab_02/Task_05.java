/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_02;

import java.util.Scanner;

/**
 *
 * @author 19101038
 */
public class Task_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[10];
        int count=0;
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        int x= sc.nextInt();
        for (int j = 0; j<a.length; j++) {
            if(a[j]==x)
            {
             count++;
            }
        }
        if(count==1)


           {
               System.out.println("YES");
           }
        else
        {
            System.out.println("NO");
        }
        
    }
    
}
