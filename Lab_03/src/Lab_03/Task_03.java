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
public class Task_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        for(int i=0; i < name.length(); i++)
        {
            System.out.println(name.charAt(i)+" : "+name.codePointAt(i));
        }
     }
}
