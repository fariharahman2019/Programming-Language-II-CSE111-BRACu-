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

public class Task_09 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        int[] a = new int[10];
        for (i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        for (i = 0; i < a.length; i = i + 2) {
            System.out.print(a[i]+" ");
        }
        for (i = 1; i < a.length; i = i + 2) {
            System.out.print(a[i]+" ");
        }
    }

}
