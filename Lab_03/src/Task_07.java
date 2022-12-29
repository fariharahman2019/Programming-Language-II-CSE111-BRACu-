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

public class Task_07 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name1 = sc.nextLine();
        String name2 = sc.nextLine();

        //compareTo
        System.out.println(name1.compareTo(name2));

        //compareToIgnoreCase        
        System.out.println(name1.compareToIgnoreCase(name2));

        //startsWith
        System.out.println(name1.startsWith(name2));

        //endsWith
        System.out.println(name1.endsWith(name2));

        //equals
        System.out.println(name1.equals(name2));

        //equalsIgnoreCase
        System.out.println(name1.equalsIgnoreCase(name2));

        //indexOf
        String a = sc.nextLine();
        System.out.println(name1.indexOf(a));

        //lastIndexOf
        String a1 = sc.nextLine();
        System.out.println(name1.lastIndexOf(a1));

        //length
        System.out.println(name1.length());

         //replace
        String a2 = sc.nextLine();
        System.out.println(name1.replace(name1,a2));
        
         //substring
        int a3 = sc.nextInt();
        System.out.println(name1.substring(a3));
        
         //toCharArray
        System.out.println(name1.toCharArray());
        
         //toLowerCase
        System.out.println(name1.toLowerCase());
        
        //toUpperCase
        System.out.println(name1.toUpperCase());
        
        //trim
        System.out.println(name1.trim());
        
        //valueOf
        double d= sc.nextDouble();
        System.out.println(String.valueOf(d));
        
        
    }

}
