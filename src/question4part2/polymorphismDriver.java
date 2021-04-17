/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question4part2;

/**
 *
 * @author Hemanth Venkata Reddy Telluri
 */
public class polymorphismDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Animal animal1=new Animal();
    animal1.animalEat();
    Animal animal2=new Dog();
    animal2.animalEat();
    }
    
}
