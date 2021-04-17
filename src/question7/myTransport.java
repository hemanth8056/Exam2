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
enum Transportation {
  PLANE,
  TRAIN,
  BUS
}

public class myTransport { 
  public static void main(String[] args) {
    Transportation myTra = Transportation.PLANE; 
                
    switch(myTra) {
      case PLANE:
        System.out.println("Journey is too faster");
        break;
      case TRAIN:
        System.out.println("Journey is medium faster");
        break;
      case BUS:
        System.out.println("Journey is late");
        break;
    }
  }
}