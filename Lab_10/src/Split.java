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
public class Split {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input;
        input = new Scanner(new File("C:\\Users\\19101038\\Desktop\\input.txt"));
        String line=input.nextLine();
        
        //String [] f=line.split("\\s"); //for space split
        //String [] f=line.split("\\."); //for full stop split
        //String [] f=line.split("\\n"); //for new line split
        //String [] f=line.split("\\/"); //for date split
        String [] f=line.split("\\\\");
        for(int i=0;i<f.length;i++){
            System.out.println(f[i]);
        }
    }
}
