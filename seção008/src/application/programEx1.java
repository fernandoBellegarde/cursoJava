package application;

import java.util.Locale;
import java.util.Scanner;
import entities.rectangleEx1;

public class programEx1 {

	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		rectangleEx1 rect = new rectangleEx1();
		
		System.out.println("Enter rectangle width and heigh: ");		
		rect.a = sc.nextDouble();
		rect.b = sc.nextDouble();
		
		System.out.printf("AREA = %.2f%n", rect.area());
		System.out.printf("PERIMETER = %.2f%n", rect.perimeter());
		System.out.printf("DIAGONAL = %.2f%n", rect.diagonal());
	    sc.close();
	
	}

}
