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

public class Task_05 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter any word");
        String f = input.nextLine();
        int a[] = new int[91];

        for (int i = 0; i < f.length(); i++) {
            char c = f.charAt(i);
            int Lol = f.codePointAt(i);
            for (int j = 0; j < a.length; j++) {
                if (j == Lol) {
                    a[j]++;
                }
            }
        }
        int max = 0;
        for (int i = 0; i < a.length; i++) {

            if (a[i] > a[max]) {
                max = i;
            }
        }
        int secondMax = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > a[secondMax] && i != max) {
                secondMax = i;
            }
        }

        System.out.println((char) (secondMax));

    }

}
