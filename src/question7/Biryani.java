/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question7;

/**
 *
 * @author Hemanth Venkata Reddy Telluri
 */
enum Size {
  SMALL,
  MEDIUM,
  HIGH
}

public class Biryani {
  public static void main(String[] args) {
    Size myVar = Size.MEDIUM;

    switch(myVar) {
      case SMALL:
        System.out.println("It costs 20$");
        break;
      case MEDIUM:
         System.out.println("It costs 40$");
        break;
      case HIGH:
        System.out.println("It costs 60$");
        break;
    }
  }
}