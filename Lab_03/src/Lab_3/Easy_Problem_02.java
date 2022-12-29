import java.util.Scanner;
public class Easy_Problem_02
{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a line");
        String line=sc.nextLine();
        for(int i=0;i<line.length();i++){
            char x=line.charAt(i);
            if(x==' '){
                System.out.print(" ");
            }
            else{
                System.out.print((char)(x+1));
            }
        }
        System.out.println();
    }
}