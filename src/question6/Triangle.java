/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question6;

/**
 *
 * @author Hemanth Venkata Reddy Telluri
 */
public class Triangle extends GeometricObject {
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c, String color, boolean filled) {
        super(color, filled);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double calculateArea() {
        double temp =calculatePerimeter()/2;
        return Math.round(Math.sqrt(temp*(temp-a)*(temp-b)*(temp-c))*100)/100.0;
    }

    @Override
    public double calculatePerimeter() {
       return Math.round(a+b+c);
               }

    @Override
    public String toString() {
        return "Area: "+calculateArea()+"\n Perimeter: "+calculatePerimeter()+
                "\n Color: "+super.getColor()+"\n IsFilled: "+super.filled();
    }
    
}
   
