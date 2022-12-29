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

public class Task5 {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        double i, e, r, l, c, f;
        e = sc.nextDouble();
        r = sc.nextDouble();
        l = sc.nextDouble();
        c = sc.nextDouble();
        f = sc.nextDouble();

        i = e / Math.sqrt(r * r + (2 * Math.PI * f * l - (1 / (4 * Math.PI * Math.PI * f * c * f * c))));
        System.out.println("I = " + i);
    }
}
