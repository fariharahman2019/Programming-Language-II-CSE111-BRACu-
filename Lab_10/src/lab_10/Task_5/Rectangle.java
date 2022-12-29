/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_10.Task_5;

/**
 *
 * @author 19101038
 */
public class Rectangle extends Shape{
     protected double width;
     protected double length;
    public Rectangle(){
        
    }
    public Rectangle(double width, double length){
        this.width=width;
        this.length=length;
    }
    public Rectangle(double width, double length, String color, boolean filled){
        this.width=width;
        this.length=length;
        this.color=color;
        this.filled=filled;
    }
    public double getWidth(){
        return width;
    }
    public void setWidth(double width){
        this.width=width;
    }
    public double getLength(){
        return length;
    }
    public void setLength(double length){
        this.length=length;
    }
    
     public double getArea(){
         double area=length*width;
         return area;
     }
     public double getPerimeter(){
         double perimeter = 2*length*width;
         return perimeter;
     }
     public String toString(){
         return "THIS IS A RECTANGLE";
     }
}
