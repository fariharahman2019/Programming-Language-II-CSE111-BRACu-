        /*
         * To change this license header, choose License Headers in Project Properties.
         * To change this template file, choose Tools | Templates
         * and open the template in the editor.
         */
        package lab_01;

        import java.util.Scanner;

        /**
         *
         * @author 19101038
         */
        public class Prob_2 {
            public static void main(String[]args)
            {
            Scanner sc = new Scanner(System.in);
                System.out.println("Please enter any number");
                int n = sc.nextInt();
                System.out.println("Please enter another number");
                int m = sc.nextInt();
                for (int row = 1; row <= n; row++) 
                {
                    for(int column=1; column<=m; column++)
                    {
                        System.out.print(column);
                    }
                    System.out.println();
     
                }
                
            }

        }
