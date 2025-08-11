package application;

import java.util.Locale;
import java.util.Scanner;

import entities.circleCalculator;

public class programCircle {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter radius: ");
		
		double radius = sc.nextDouble();
		
		double c = circleCalculator.circumference(radius);
		
		double v = circleCalculator.volume(radius);
		
		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", circleCalculator.PI);

		sc.close();
	}

}
