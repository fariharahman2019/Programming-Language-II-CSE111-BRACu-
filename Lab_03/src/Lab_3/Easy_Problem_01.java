import java.util.Scanner;
public class Easy_Problem_01{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any word");
        String word = sc.next();
        char[] a = word.toCharArray();
        
        for(int i=0 ; i<a.length; i++){
            for(int j=i+1 ; j<a.length ; j++){
                if(a[i] > a[j]){
                    char x = a[i];
                    a[i] = a[j];
                    a[j] = x;
                }
            }
        }
        for(int i=0 ; i<a.length ; i++){
            System.out.print(a[i]);
        }   
System.out.println();
    }
}