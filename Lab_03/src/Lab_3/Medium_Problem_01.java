import java.util.Scanner;
public class Medium_Problem_01{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a word");
        String word=sc.next();
        int i=0;
        for(int j=i+1;j<=word.length();j++){
            System.out.println(word.substring(i,j));
            
        }
    }
}