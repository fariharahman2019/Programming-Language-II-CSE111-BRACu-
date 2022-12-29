import java.util.Scanner;
public class Task7_b
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    String name1 = sc.nextLine();
    String name2 = sc.nextLine();
    
    
    System.out.println(name1.compareToIgnoreCase(name2));
  }
}