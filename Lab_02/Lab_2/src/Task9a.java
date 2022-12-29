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

public class Task9a {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[10];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < a.length; i = i + 2) {
            int min = a[i];
            int minIndex = i;
            for (int j = i; j < a.length; j = j + 2) {
                if (a[j] < min) {
                    min = a[j];
                    minIndex = j;
                }
            }
            int temp = a[i];
            a[i] = min;
            a[minIndex] = temp;
            System.out.print(a[i] + " ");
        }
        for (int i = 1; i < a.length; i = i + 2) {
            System.out.print(a[i] + " ");
        }
    }
}
