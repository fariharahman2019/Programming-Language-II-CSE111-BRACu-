import java.util.Scanner;
public class Hard_Problem_02
{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name of a programming team");
        String tn=sc.next();
        System.out.println("Enter the name of the coach");
        String cn=sc.next();
        int digit_product1=1;
        int digit_product2=1;
       
        for(int i=0;i<tn.length();i++){
            digit_product1=digit_product1*(tn.codePointAt(i)-64);
        }
        for(int i=0;i<cn.length();i++){
            digit_product2=digit_product2*(cn.codePointAt(i)-64);
        }
        if((digit_product1%14)<(digit_product2%14)){
            System.out.println("I Am Happy With My Coach");
        }
        else{
            System.out.println("I Am Sad With My Coach");
        }
    }
}