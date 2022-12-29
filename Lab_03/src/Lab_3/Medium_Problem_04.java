import java.util.Scanner;
public class Medium_Problem_04
{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int [] a = new int [s.length()];
    int i;
      for(i=0;i<s.length();i++){
       a[i] = s.codePointAt(i);
      }
      for(i=0;i<s.length()-1;i++){
        if(a[i]!=a[i+1]){
         System.out.print((char)a[i]);
        }
      }
      System.out.print((char)a[s.length()-1]);
  }
}