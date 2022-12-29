import java.util.Scanner;
public class Hard_Problem_04
{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    String s = sc.next();
    for(int i=0;i<s.length();i++){
      int y = (s.codePointAt(i)+num);
      if(y>64 && y<91){ 
      char d = (char)y;
      System.out.print(d);
      }
      if(y>90){
      y = (s.codePointAt(i)+num)-26;
      char d = (char)y;
      System.out.print(d);
      }
    }
    System.out.println();
  }
}