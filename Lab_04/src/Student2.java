/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fariha
 */
public class Student2 {

    public String name;
    public String id;
    public String address;
    public double cgpa;

    public Student2 (String n, String i, String a, double c) {
        name = n;
        id = i;
        address = a;
        cgpa = 3;
    }

    public String getName() {
        return name;
    }
 
    public String getId() {
        return id;
    }

    public String getAddress() {
        return address;
    }

    public double getCgpa() {
        return cgpa;
    }
}
