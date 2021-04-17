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
public class Faculty extends Employee{
    private String officeHours;
    private int numberOfSubjects;

    public Faculty(String officeHours, int numberOfSubjects, String office,
            double salary, Date dateHired, String name, String address, String phone, String email) {
        super(office, salary, dateHired, name, address, phone, email);
        this.officeHours = officeHours;
        this.numberOfSubjects = numberOfSubjects;
    }
    @Override
    public String toString() {
        return "Faculty name: "+super.getName();
    }   
}
