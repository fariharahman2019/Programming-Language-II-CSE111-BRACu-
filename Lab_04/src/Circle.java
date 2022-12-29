/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fariha
 */
public class Circle {

    private double radius;
    private String color;

    public Circle() {
        radius = 1.0;
        color = "Red";
    }

    public Circle(double r, String c) {
        radius = r;
        color = c;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        double area = Math.PI * radius * radius;
        return area;
    }
}
