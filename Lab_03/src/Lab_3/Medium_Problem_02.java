import java.util.Scanner;
public class Medium_Problem_02{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        for(int k=0;k<1;k++){
            String word=sc.next();
            int count=0;
            char[] a=word.toCharArray();
            for (int i = 0; i < word.length(); i++) {
                for (int j = i + 1; j < word.length(); j++) {
                    if (a[i] == a[j]) {
                        count++;
                        
                    }
                }
            }
            if(count>=1){
                System.out.println("Duplicate alphabets found.Please enter another word");
                k--;
            }
            if(count==0){
                System.out.println("You entered "+word);
            }
        }
    }
}
