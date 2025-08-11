package application;

import java.util.Locale;
import java.util.Scanner;

import entities.dollarConverter;

public class programEx4Dollar {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("What is the dollar price? ");

		double dollarPrice = sc.nextDouble();
		
		System.out.print("How may dollars will be bought? ");
		double dollarsBought = sc.nextDouble();
		double result = dollarConverter.amountPaid(dollarPrice, dollarsBought);
		
		System.out.printf("Amount to be paid on reais = %.2f", result);

		sc.close();
	}

}
