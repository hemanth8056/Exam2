/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question3;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Hemanth Venkata Reddy Telluri
 */
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         System.out.println("answer for question 3: "+"Hemanth Venkata Reddy Telluri");
          ArrayList<Object> list=new ArrayList<Object>();
        Loan loan= new Loan(250000.0,10.0,3);
        Circle circle=new Circle(10.0);
        Date date=new Date();
        String str="windows";
        
        list.add(loan);
        list.add(circle);
        list.add(date);
        list.add(str);
        for(Object obj:list)
        {
            System.out.println(obj);
        }
        
    }
    
}
    
    

