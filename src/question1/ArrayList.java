/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question1;

import java.util.Scanner;

/**
 *
 * @author Hemanth Venkata Reddy Telluri
 */
public class ArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        java.util.ArrayList<Integer> array = new java.util.ArrayList<>();
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter ten integers: ");
        for (int i = 0; i < 10; i++) {
            array.add(scan.nextInt());
        }
        removeDuplicate(array);
    }

    public static void removeDuplicate(java.util.ArrayList<Integer> list) {

        java.util.ArrayList<Integer> array = new java.util.ArrayList<>();
        int temp = 0;

        for (int i = 0; i < list.size(); i++) {
            if (!array.contains(list.get(i))) {
                array.add(list.get(i));
            }
        }
        System.out.print("The distinct integers ");
        for (int i = 0; i < array.size(); i++) {
            System.out.print(array.get(i) + " ");
        }
    }
}
