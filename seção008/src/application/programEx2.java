package application;

import java.util.Locale;
import java.util.Scanner;

import entities.employeeEx2;

public class programEx2 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		employeeEx2 employee = new employeeEx2();
	
		System.out.print("Name: ");
		employee.name = sc.nextLine();
		
		System.out.print("Gross salary: ");
		employee.grossSalary = sc.nextDouble();
		
		System.out.print("Tax: ");
	    employee.tax = sc.nextDouble();
	    System.out.println();
	    
	    
	    
	    System.out.println("Employee: " + employee);
	    
	    System.out.print("Which percentage to increase salary? ");
	    double increaseSalary = sc.nextDouble();
	    System.out.println();
	    employee.increaseSalary(increaseSalary);
	   
	    System.out.print("Updated data: " + employee);
	    
	    sc.close();
	   
	}

}
