/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task_03;

/**
 *
 * @author Fariha
 */
public class Student {
     public String name="Ei name e kono Student nai";
    public String id="Student ei nai abar id :P";
    public String address="Naam nai . . thikana asbe koi theke";
    public double cgpa=-4.0;
    
    public Student(){
        
    }
    public Student(String n,String i,String a,double c){
        name=n;
        id=i;
        address=a;
        cgpa=c;
    }
    public void nameBoshao(String n){
        name=n;
    }
    public void addressBoshao(String a){
        address=a;
    }
    public void idBoshao(String i){
        id=i;
    }
    public void cgpaBoshao(double c){
        cgpa=c;
    }
    public String nameDao(){
        return name;
    }
    public String boloToAmiKe(){
        return id;
    }
    public String addressDao(){
        return address;
    }
    public double cgpaDao(){
        return cgpa;
    }
    public void standUp(){
        System.out.println(name+" is now standing up !!");
    }
    public String tellMeYourName(){
        return "Sir, my name is "+name;
    }
    public void call(String n){
        name=n;
        System.out.println("Hey, "+name+", Sir is calling you!!");
    }
    public int add2Numbers(int a,int b){
        int add=a+b;
        return add;
    }
}
