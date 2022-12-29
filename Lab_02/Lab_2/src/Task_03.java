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
public class Task_03 {
    public static void main(String[]args)
  {
    Scanner sc =new Scanner(System.in);
    int[] a=new int [10];
    for(int i=0;i<a.length;i++)
    {
      a[i]=sc.nextInt();
    }
    
    for(int j=0;j<a.length;j++)
    {
      int max=a[j];
      int maxLocation=j;
      for(int i=j+1;i<a.length;i++)
      {
        if(a[i]>max)
        {
          max=a[i];
          maxLocation=i;
        }
      }
      System.out.print(max+",");
      int temp=a[j];
      a[j]=a[maxLocation];
      a[maxLocation]=temp;
    }
  }
}
