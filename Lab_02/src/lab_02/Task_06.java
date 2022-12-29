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

public class Task_06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[15];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
            if (a[i] <= 0 && a[i] >= 9) {
                i--;
            }
        }
        for (int i = 0; i <=9; i++) {
            int count = 0;
            for (int j = 0; j < a.length; j++) {
                if(a[j]==i){
                    count++;
                }
            }
            System.out.println(i+" was entered "+count+" times");
        }
    }
}