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

public interface Remote {
    abstract public void powerOn();
    abstract public void volumeUp();
    abstract public void volumeDown();
    abstract public void powerOff();
}
class Television implements Remote{

    @Override
    public void powerOn() {
        System.out.println("Power On");
    }
    @Override
    public void volumeUp() {
        System.out.println("Volume Up");
    }
    @Override
    public void volumeDown() {
        System.out.println("Volume Down");
    }
    @Override
    public void powerOff() {
        System.out.println("Power Off");
    }
}
class Main {
    public static void main(String[] args) {
    Remote remote= new Television();
    remote.powerOn();
    remote.volumeUp();
    remote.volumeDown();
    remote.powerOff();
    }
}

