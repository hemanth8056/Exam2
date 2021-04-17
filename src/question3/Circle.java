/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question3;

/**
 *
 * @author Hemanth Venkata Reddy Telluri
 */
public class Circle {
private double radius;
private double circumference;
private double area;
public Circle(double radius)
{
this.radius = radius;
circumference = (100*2*3.14*radius)/100.0;
this.area = (100*2*radius*3.14)/100.0;
}
@Override
public String toString(){
return "radius: " + radius + ", circumference: " + circumference + ", area: " + area;
}
}
