/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question9;

/**
 *
 * @author Hemanth Venkata Reddy Telluri
 */
public interface Animal {
    abstract public void run();
    abstract public void eat();
    abstract public void sleep();
   
}
class Dog implements Animal{

    @Override
    public void run() {
        System.out.println("Dog catches cat by running");
    }
    @Override
    public void eat() {
        System.out.println("Dog is eatting chicken");
    }
    @Override
    public void sleep() {
        System.out.println("Dog is sleeping under the table");
    }
}
class Main {
    public static void main(String[] args) {
   Animal myDog= new Dog();
   myDog.run();
   myDog.eat();
   myDog.sleep();
    }
}