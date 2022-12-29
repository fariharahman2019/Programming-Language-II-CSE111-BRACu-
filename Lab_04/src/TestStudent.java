/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fariha
 */
public class TestStudent {
     public static void main(String[] args) {
        Student john = new Student();
        Student mike = new Student();
        Student carol = new Student();

        john.setName("John Mollah");
        john.setId("19101040");
        john.setAddress("Banasree");
        john.setCgpa(3.5);

        System.out.println(john.getName());
        System.out.println(john.getId());
        System.out.println(john.getAddress());
        System.out.println(john.getCgpa());
        System.out.println();

        mike.setName("Mike Ali");
        mike.setId("19101363");
        mike.setAddress("Wari");
        mike.setCgpa(3.0);

        System.out.println(mike.getName());
        System.out.println(mike.getId());
        System.out.println(mike.getAddress());
        System.out.println(mike.getCgpa());
        System.out.println();

        carol.setName("Carol Rahman");
        carol.setId("19101038");
        carol.setAddress("Banani");
        carol.setCgpa(5.0);

        System.out.println(carol.getName());
        System.out.println(carol.getId());
        System.out.println(carol.getAddress());
        System.out.println(carol.getCgpa());
        System.out.println();
    }

}
