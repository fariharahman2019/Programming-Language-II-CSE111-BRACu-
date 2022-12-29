import java.util.Scanner;
public class Medium_Problem_03{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int sum=0;
        System.out.println("Enter a word");
        String w1=sc.next();
        System.out.println("Enter another word");
        String w2=sc.next();
        String space=" ";
        String new_w1=w1.concat(space);
        System.out.println(new_w1.concat(w2));
        
        for(int i=0;i<w1.length();i++){
            sum=sum+w1.codePointAt(i);
        }
        for(int i=0;i<w2.length();i++){
            sum=sum+w2.codePointAt(i);
        }
        System.out.println(sum);
    }
}
