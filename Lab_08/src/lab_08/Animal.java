/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_08;

/**
 *
 * @author 19101038
 */
public class Animal {
  //Name of the Animal
  private String sound = "Animal Sound";

  //Default Constructor
  public Animal(){
  }

  //Overloaded Constructor
  Animal(String _sound){
    this.sound = _sound;
  }

  //Return sound
  public String makeSound(){
    return sound;
  }
}