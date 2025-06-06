package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.IndependentContractor;
import entities.PhysicalPerson;
import entities.Tax;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Tax> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			System.out.println("Tax payer # " + i + " data:");
			System.out.print("Individual or company (i/c)? ");
			char ch = sc.next().charAt(0);
			sc.nextLine();
		
			System.out.print("Name: ");
			String name = sc.nextLine();
			
			System.out.print("Anual income: ");
			double rendaAnual = sc.nextDouble();
			
			if(ch == 'i') {
				System.out.print("Health expenditures: ");
				double healthExpend = sc.nextDouble();
				
				list.add(new PhysicalPerson(name, rendaAnual, healthExpend));
			} else {
				System.out.print("Number of employees: ");
				int numberEmp = sc.nextInt();
				
				list.add(new IndependentContractor(name, rendaAnual, numberEmp));
			}
			
		}
		System.out.println();
		double totalTax = 0.0;
  
        for (Tax tax : list) {

        	System.out.println("TAX PAID:");
        	
			System.out.println(tax.getName() + " $ " + String.format("%.2f", tax.imposto()));
		    totalTax = totalTax + tax.imposto();
		    
		}
        
        System.out.println();
	    System.out.printf("TOTAL TAXES: $ %.2f%n", totalTax);
        
		
		sc.close();
		
	}

}
