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
// Abstract class
abstract class Remote {
  // Abstract method (does not have a body)
  public abstract void PowerOn();
  // Regular method
  public void volume() {
    System.out.println("Volume of televiosion increased or decreased");
  }
}
class Television extends Remote{

    @Override
    public void PowerOn() {
        System.out.println("Television is switched on");
}
}
class Main {
  public static void main(String[] args) {
      Television myTelevision=new Television();
      myTelevision.PowerOn();
      myTelevision.volume();
  }
  }