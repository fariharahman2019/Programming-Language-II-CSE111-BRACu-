/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 19101038
 */
import java.util.Scanner;

public class Task_04 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter Any Word:");

        int[] a = new int[26];
        String name = sc.nextLine();
        String upper = name.toUpperCase();
        int n;
        for (int i = 0; i < upper.length(); i++) {
            n = upper.codePointAt(i) - 65;
            a[n]++;
        }
        for (int i = 0; i < a.length; i++) {
         int j=65+i;
         char c = (char) j;
         System.out.println(c+" which is "+ j + " was found " + a[i]+" times");
        }
    }
}
