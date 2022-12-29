import java.util.Scanner;
public class Task4
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter a word");
    String name = sc.nextLine();
    int len = name.length();
    int [] alphabet = new int [256];
    
    for(int index=0; index<len; index++)
    {
      char lol = name.charAt(index);
      int codeForLol = name.codePointAt(index);
      for(int code =0; code<alphabet.length; code++)
      {
        if(code==codeForLol)
        {
          alphabet[code]++;
        }
      }
    }
    for(int index=65; index<=90; index++)
    {
      System.out.println((char)index+" which is "+index+" was found "+alphabet[index]+" times ");
    }
  }
}