/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 19101038
 */
public class Student {
    public String name;
    static int numberOfStudents;
    
    public Student(){
        name="default name";
        numberOfStudents++;
    }
    public Student (String n){
        name=n;
        numberOfStudents++;
    }
    public String getName(){
        return name;
    }
}
