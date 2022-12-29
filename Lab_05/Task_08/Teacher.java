/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_05;

/**
 *
 * @author Fariha
 */
public class Teacher {
     public String name;
  public String department;
  Course [] a = new Course[4];
  public Teacher()
  {
  }
  public Teacher(String n, String d)
  {
    name = n;
    department = d;
  }
  public void addCourse(Course add)
  {
    
    for(int i=0; i<a.length; i++)
    {
      if(a[i]==null)
      {
        a[i] = add;
        break;
      }
    }
  }
  public void printDetail()
  {
    System.out.println("=========================");
    System.out.println("Name: "+name);
    System.out.println("Department: "+department);
    System.out.println("List of courses");
    System.out.println("=========================");
    
    for(int i=0; i<a.length; i++)
    {
      if(a[i]!=null)
      {
       System.out.println(a[i].courseName);
      }
    }
    System.out.println("========================="); 
  }    

}
