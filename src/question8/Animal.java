/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question8;

/**
 *
 * @author Hemanth Venkata Reddy Telluri
 */
class Main {
    public static void main(String[] args) {
    Dog myDog = new Dog(); // Create a Pig object
    myDog.eat();
    myDog.run();
  }
 }
  abstract class Animal {
  // Abstract method (does not have a body)
    public abstract void eat();
  // Regular method
    public void run() {
    System.out.println("Animal is running");
  }
}
// Subclass (inherit from Animal)
class Dog extends Animal {

    @Override
    public void eat() {
    System.out.println("Dog is eatting");
}
}


