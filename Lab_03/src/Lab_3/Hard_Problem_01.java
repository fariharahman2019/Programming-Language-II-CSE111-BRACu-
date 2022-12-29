import java.util.Scanner;
public class Hard_Problem_01{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        String num=sc.next();
        int digit_sum=0;
       
        for(int i=0;i<num.length();i++){
            digit_sum=digit_sum+num.charAt(i)-'0';
        }
        if(digit_sum%3==0){
        System.out.println(num+" is divisible by 3");
        }
        else{
        System.out.println(num+" is not divisible by 3");
        }
    }
}