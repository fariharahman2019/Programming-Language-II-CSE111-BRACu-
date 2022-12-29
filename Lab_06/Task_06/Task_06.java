/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fariha
 */
import java.util.Scanner;

public class Task_06 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter any number");
        int num = input.nextInt();

        int a[] = new int[num];
        int b[] = new int[num];

        for (int i = 0; i < a.length; i++) {
            a[i] = input.nextInt();
        }

        for (int i = 0, j = 0; i < a.length; i++) {

            if (a[i] > 0) {
                b[j] = a[i];
                j++;
            }

        }

        for (int i = 0; i < b.length; i++) {
            if (b[i] != 0) {
                System.out.print(b[i] + " ");
            }
        }
    }

}
