/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fariha
 */
public class Task_07 {

    public static int[] removeOdd(int[] input) {
        int[] a;
        a = new int[input.length];

        for (int i = 0, j = 0; i < input.length; i++) {
            if (input[i] % 2 == 0) {
                a[j] = input[i];
                j++;
            }
        }
        return a;
    }

    public static void main(String[] args) {
        int[] mixedArray = {21, 33, 44, 66, 11, 1, 88, 45, 10, 9};
        for (int i = 0; i < mixedArray.length; i++) {
            System.out.print(mixedArray[i] + " ");
        }
        System.out.println();
        int[] noOdd = removeOdd(mixedArray);
        for (int i = 0; i < noOdd.length; i++) {
            System.out.print(noOdd[i] + " ");
        }
    }
}
