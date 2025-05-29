package application;

import java.util.Locale;
import java.util.Scanner;

public class Ex2SomaVetor {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("How many numbers will you enter? ");
		int n = sc.nextInt();
	    double[] vect = new double[n];
		
	    for(int i=0;i<vect.length;i++) {
	    	System.out.print("Enter a number: ");
	    	vect[i] = sc.nextDouble();
	    }
	  
	    double sum = 0.0;
	   
	    for(int i=0;i<vect.length;i++) {
	    	 sum += vect[i];
	    }
	     double avg = sum / vect.length;
	    
	     System.out.print("VALORES = ");

		    for (int i=0; i<n; i++) {
		    	System.out.printf("%.1f %n ", vect[i]);
		    }

		    System.out.printf("SOMA = %.2f/n", sum);
		    System.out.printf("MEDIA = %.2f\n", avg);

	    
		sc.close();

	}

}
