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
public class Vehicle2010 extends Vehicle{
    public void moveLowerLeft(){
        super.moveDown();
        super.moveLeft();
    }
    public void moveUpperrLeft(){
        super.moveUp();
        super.moveLeft();
    }
    
    public void moveUpperLeft(){
        super.moveUp();
        super.moveLeft();
    }
    
    public void moveLowerRight(){
        super.moveDown();
        super.moveRight();
    }
    
    public boolean equals(Vehicle e){
        if(super.x==e.x && super.y==e.y){
            return true;
        }
        else{
            return false;
        }
    }
}
