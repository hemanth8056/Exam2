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
public class personDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Date dateHired=new Date(4, 02, 12);
        Person per = new Person("Sravani","1-66 Gudivada","9490445388","tadiparthi"
                + "sravani@gmail.com");

		Student stu = new Student(3.56,"Chandra","2-12 Vadlamudi",
                        "9940412837","chandratata@gmail.com");

		Employee emp = new Employee("3-northwest",1500000.0,dateHired,
                        "Sai","Newyork","6605281382","sai0007@gmail.com");

		Faculty fac = new Faculty("450",3,"Bangloore",135000.0,
                        dateHired,"kiran","Atlanta","6605281384","kiran77@gmail.com");

		Staff staff = new Staff("Professor","Hydreabad",1800000.0,
                        dateHired,"Raghavendra","Missouri","6605281386",
                        "rraghavreddy@gmail.com");
    // Invoke toString of Person, Student, Employee, Faculty and Staff
		System.out.println(per);
		System.out.println(stu);
		System.out.println(emp);
		System.out.println(fac);
		System.out.println(staff);
	}
    }
    
    
    

