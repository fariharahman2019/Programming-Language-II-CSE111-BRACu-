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

public class Task6 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int y = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 1) {
                y = y + i * i;
            } else {
                y = y - i * i;
            }
        }
        System.out.println("Y = " + y);
    }
}
