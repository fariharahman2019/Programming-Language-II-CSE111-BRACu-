/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 19101038
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Tokenizer {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner input;
        input = new Scanner(new File("C:\\Users\\19101038\\Desktop\\input.txt"));

        String date = input.nextLine();
        String[] d = date.split("/");
        for (int i = 0; i < d.length; i++) {
            System.out.println(d[i]);
        }

        System.out.println(input.nextInt());
        input.nextLine();

        String lorem = input.nextLine();
        String[] l = lorem.split("\\s");
        for (int i = 0; i < l.length; i++) {
            System.out.println(l[i]);
        }
    }
}
