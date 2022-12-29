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
public class Circle extends Shape{
    protected double radius;
    public Circle(){
        
    }
    public Circle(double radius){
        this.radius=radius;
    }
    public Circle(double radius, String color, boolean filled){
        this.radius=radius;
        this.color=color;
        this.filled=filled;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius=radius;
    }
     public double getArea(){
         double area=Math.PI*radius*radius;
         return area;
     }
     public double getPerimeter(){
         double perimeter = 2*3.1416*radius;
         return perimeter;
     }
     public String toString(){
         return "THIS IS A CIRCLE";
     }
}
