/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_10.Task_1;

/**
 *
 * @author 19101038
 */
public abstract class Animal {
    public String name;
  
    public String getName(String n){
        name = n;
        return name;
    }
    public abstract void makeNoise();
            
}
