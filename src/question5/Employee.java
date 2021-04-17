/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question5;

import java.util.Date;

/**
 *
 * @author Hemanth Venkata Reddy Telluri
 */
public class Employee extends Person{
     private String office;
     private double salary;
      Date dateHired;

    public Employee(String office, double salary, Date dateHired, String name,
            String address, String phone, String email) {
        super(name, address, phone, email);
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;
    }
    @Override
    public String toString() {
        return "Employee name: "+super.getName();
    }  
}
