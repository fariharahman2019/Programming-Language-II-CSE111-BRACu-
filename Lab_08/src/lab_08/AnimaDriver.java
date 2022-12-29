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
public class AnimaDriver {
    public static void printSound(Animal a){
    System.out.println(a.makeSound());
  }

  public static void main(String [] args){
    Dog d1 = new Dog("bark");
    Cat c1 = new Cat("meow");
    Animal a1 = new Animal("Animal do not make sound");
    printSound(a1);
    printSound(c1);
    printSound(d1);
  }
}

