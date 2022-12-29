/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_10.Task_2;

/**
 *
 * @author 19101038
 */
public abstract class Person {

    public String name;
    public double salary;
    public int year;
    public String nin;

    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    public void setSalary(double s) {
        salary = s;
    }

    public double getSalary() {
        return salary;
    }

    public void setYear(int y) {
        year = y;
    }

    public int getYear() {
        return year;
    }

    public void setNin(String n) {
        nin = n;
    }

    public String getNin() {
        return nin;
    }

    public abstract void print();

    public void equals(Employee e) {
        if (name == e.name && year == e.year && nin == e.nin && salary == e.salary) {
            System.out.println("Both are same person");
        } else {
            System.out.println("They are different person");
        }
    }

}
