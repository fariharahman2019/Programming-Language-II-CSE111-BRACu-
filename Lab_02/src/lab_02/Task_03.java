/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_02;

/**
 *
 * @author 19101038
 */
import java.util.Scanner;

public class Task_03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[10];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        for (int j = a.length - 1; j >= 0; j--) {
            System.out.print(a[j] + " ");
        }
        System.out.println();
    }

}
