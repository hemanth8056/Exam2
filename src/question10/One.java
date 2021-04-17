/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question10;

/**
 *
 * @author Hemanth Venkata Reddy Telluri
 */
public class One {
    private int a;
    public One(int in){
        a = in;
//        System.out.println("in constructor one = "+a);
    }
    public int guess (int x){
        System.out.println("One guess " + x);
        return a + x;
    }
    
    public int apply (int x){
        System.out.println("One guess " + x);
        return guess(x + 3);
    }

   
}

