/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fariha
 */
public class Book {

    public String title;
    public String author;
    public double price;
    
    public Book(String title, String author, double price){
        this.title=title;
        this.author=author;
        this.price= price;
    }

    public void setTitle(String title){
        this.title=title;
    }
    public void setAuthor(String author){
     this.author=author;   
    }
    public void setPrice(double price){
        this.price= price;
    }
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public String toString(){
        return  title+" by "+author+" Price: "+price;
    }
}
