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
public class Prob_14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter any number");
        int n = sc.nextInt();
        for (int row = 1; row <= n; row++) {
            for (int space = 1; space <= n - row; space++) {
                System.out.print(" ");
            }
            for (int column = 1; column <= row; column++) {
                System.out.print(column);
            }
            for (int column = row - 1; column >= 1; column--) {
                System.out.print(column);
            }
            System.out.println();
        }
    }
}
