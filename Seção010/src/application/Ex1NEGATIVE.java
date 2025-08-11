package application;

import java.util.Locale;
import java.util.Scanner;

public class Ex1NEGATIVE {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("How many numbers will you enter? ");
		     int n = sc.nextInt();		
		     double[] vect = new double[n];
		    
			for(int i=0;i<vect.length;i++) {
				sc.nextLine();
				System.out.print("Enter a number: ");
				vect[i] = sc.nextDouble();
			}
			 System.out.println("NEGATIVE NUMBERS");
			
			  for (int i=0; i<n; i++) {
			        if (vect[i] < 0) {
			        	System.out.printf("%.2f%n", vect[i]);
			        }
			    }
	
		
		
		
		sc.close();
	}

}
