/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_10.Task_3;

/**
 *
 * @author 19101038
 */
public abstract class Author { 
{
    private String name;
    private String email;
    private char gender;
    public boolean isMale = false;
    
    public Author(String n, String e, char g)
    {
        name = n;
        email = e;
        gender =g;
        if(g=='m')
        {
            isMale=true;
        }
    } 
    public String getName()
    {
        return name;
    }
    public void setEmail(String e)
    {
        email = e;
    }
    public String getEmail()
    {
        return email;
    } 
    public char getGender()
    {
        if(gender=='m')
        {
            isMale = true;
        }
        return gender;
    }
    public String toString()
    {
        return name+"("+gender+")"+" at "+email;
    }
}
