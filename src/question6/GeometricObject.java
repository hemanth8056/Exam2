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
public abstract class GeometricObject {
 private String color;
    private boolean filled;

    public GeometricObject(String color,boolean filled) {
       this.color = color;
        this.filled = filled;
    }
    

   public String getColor() {
        return color;
    }

   public boolean filled(){
       return filled;
   }
public abstract double calculateArea();
public abstract double calculatePerimeter();


}