import java.util.Scanner;
public class Hard_Problem_03
{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int a = 0;
    for(int i=0;i<s.length();i++){
      int b = s.codePointAt(i);
      if(b<97){
        for(int j=i;j>=a;j--){
         System.out.print(s.charAt(j));
        }
        a=i+1;
      }
    }
  }
}