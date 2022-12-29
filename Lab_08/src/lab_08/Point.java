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
public class Point {

    private double radius;

    Point(double r) {
        radius = r;
    }

    double space() {
        System.out.println(“Space for a Point can’t be defined”);
	return 0;
    }

    protected double getRadius() {
        return radius;
    }

}
