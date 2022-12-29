/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fariha
 */
public class TestStudent2 {

    public static void main(String[] args) {
        Student2 john = new Student2("John Mollah", "19101040", "Banasree", 4.0);
        Student2 mike = new Student2("Mike Ali", "19101363", "Wari", 3.0);
        Student2 carol = new Student2("Carol Rahman", "19101038", "Banani", 0.0);

        System.out.println(john.getName());
        System.out.println(john.getId());
        System.out.println(john.getAddress());
        System.out.println(john.getCgpa());
        System.out.println();

        System.out.println(mike.getName());
        System.out.println(mike.getId());
        System.out.println(mike.getAddress());
        System.out.println(mike.getCgpa());
        System.out.println();

        System.out.println(carol.getName());
        System.out.println(carol.getId());
        System.out.println(carol.getAddress());
        System.out.println(carol.getCgpa());
        System.out.println();

    }
}
