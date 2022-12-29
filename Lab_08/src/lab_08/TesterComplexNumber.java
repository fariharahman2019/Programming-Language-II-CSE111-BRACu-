/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_08;

/**
 *
 * @author 19101038
 */
public class TesterComplexNumber {
        public static void main(String[] args) {
        RealNumber rn = new ComplexNumber();
        System.out.println(rn);
        
        System.out.println("--------------------");
        
        rn = new ComplexNumber(5, 7);
        System.out.println(rn);
        
        System.out.println("--------------------");
        ComplexNumber cn = new ComplexNumber();
        cn.check();
    }

}
