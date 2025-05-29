package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class ProgramProduct {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Product> list = new ArrayList<>();
		
		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			System.out.println("Product #" + (1+i) + " data:");
			System.out.print("Common, used or imported (c/u/i)? "); 
			char resp = sc.next().charAt(0);	
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Price: ");
			double price = sc.nextDouble();
			if(resp == 'c') {
		    list.add(new Product(name, price));			
			
			} else if(resp == 'u') {
				
				System.out.print("Manufectered date: (DD/MM/YYYY): ");
				LocalDate date = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
				list.add(new UsedProduct(name, price, date));
			
		   } else {
			  System.out.print("Custom fee: ");
			  double customsFee = sc.nextDouble();
			  
			  list.add(new ImportedProduct(name, price, customsFee));
		   }
		  
		   }
		
		System.out.println("PRICE TAGS: ");
		for (Product prod : list) {
			System.out.println(prod.priceTag());
		}
		
		
		
		
		
		
		
		
		
		sc.close();
	}

}
