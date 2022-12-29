/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task_11;

/**
 *
 * @author 19101038
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Task_11 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input;
        input = new Scanner(new File("C:\\Users\\19101038\\Desktop\\input.txt"));
        int sum=0;
        while(input.hasNextLine()){
            String f;
            f = input.next();
            int x;
            x = Integer.parseInt(f);
            sum=sum+x;  
        }
        System.out.print(sum);
    }
}
