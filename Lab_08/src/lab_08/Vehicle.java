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
public class Vehicle {

    int x;
    int y;
    public void moveUp(){
        y=y+1;
    }
    public void moveLeft(){
        x=x-1;
    }
    public void moveDown(){
        y=y-1;
    }
    public void moveRight(){
        x=x+1;
    }
    public String toString(){
        return "("+x +" , "+y+")";
    }
}
