/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fariha
 */
public class Trim {

    public static char[] trim(char[] input) {
        boolean flag = false;
        char[] c = new char[input.length];

        for (int i = 0, j = 0; i < input.length; i++) {
            if (input[i] == ' ') {
                if (flag == true) {
                    c[j] = input[i];
                    j++;
                }
                flag = false;
            } else {
                c[j] = input[i];
                j++;
                flag = true;
            }
        }
        return c;
    }

    public static void main(String[] args) {
        char[] input = {'T', 'h', 'i', 's', ' ', ' ', ' ', ' ', ' ', 'i', 's', ' ', ' ', ' ', ' ', 'a', ' ', ' ', ' ', ' ', 't', 'e', 's', 't', '.'};
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i]);
        }
        System.out.println("");
        char[] output = trim(input);
        for (int i = 0; i < output.length; i++) {
            System.out.print(output[i]);
        }
        System.out.println("");
    }
}
