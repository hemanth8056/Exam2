/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question6;

import java.util.Scanner;

/**
 *
 * @author Hemanth Venkata Reddy Telluri
 */
public class TriangleDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("answer for question 6: " + "Hemanth Venkata Reddy Telluri");
        Scanner input = new Scanner(System.in);
        boolean temp = false;
        double a = 0, b = 0, c = 0;
        do {
            temp = false;
            System.out.println("Enter side a of triangle: ");
            a = input.nextDouble();
            System.out.println("Enter side b of triangle: ");
            b = input.nextDouble();
            System.out.println("Enter side c of triangle: ");
            c = input.nextDouble();
            if (a + b <= c || b + c <= a || c + a <= b) {
                System.out.println("sum of two side must be greater than other side");
                temp = true;
            }
        } while (temp == true);
        Triangle triangle = new Triangle(a, b, c, "blue", true);
        System.out.println(triangle);
    }
}
