/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_07;

/**
 *
 * @author 19101038
 */
public class MyString {
    
    public char[] string;
    
   
    
    public int length()
    {
        if(string==null)
        {
            return 0;
        }
        return string.length;
    }
    
    
    public MyString(String n)
    {
        string = n.toCharArray();
        for(int i=0; i<string.length; i++)
        {
            System.out.print(string[i]);
        }
        System.out.println();
    }
    
    
    public char charAt(int x)
    {
        char s = string[x];
        return s;
    }
    
    
    public boolean startsWith(String prefix)
    {
        return startsWith(new MyString(prefix));
    }
    
    public boolean startsWith(MyString prefix) 
    {
        boolean flag=false;
        if(string.length==prefix.length() || string.length>prefix.length())
        {
            for(int i=0; i<prefix.length(); i++)
            {
                if(string[i]==prefix.charAt(i))
                {
                    flag=true;
                    break;
                }
            }
        }
        return flag;
    }
    
    public boolean endsWith(String suffix)
    {
        return endsWith(new MyString(suffix));
    }
    
    public boolean endsWith(MyString suffix) 
    {
        boolean flag=false;
        if(string.length==suffix.length() || string.length>suffix.length())
        {
            for(int i=suffix.length()-1; i>=0; i--)
            {
                if(string[i]==suffix.charAt(i))
                {
                    flag=true;
                    break;
                }
            }
        }
        return flag;
    }
}
