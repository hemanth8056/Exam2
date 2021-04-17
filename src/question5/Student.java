/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question5;

/**
 *
 * @author Hemanth Venkata Reddy Telluri
 */
public class Student extends Person {
    private double grade;
    public static final String status="Graduate";

    public Student(double grade, String name, String address, String phone,
            String email) {
        super(name, address, phone, email);
        this.grade = grade;
    }
    
    @Override
    public String toString() {
        return "Student name: "+super.getName();
    } 
}
