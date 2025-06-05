package application;

import java.util.Locale;
import java.util.Scanner;

import model.services3.BrazilInterestService;
import model.services3.ChinaInterestService;
import model.services3.InterestService;
import model.services3.UsaInterestService;

public class Program3 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Amount: ");
		double amountBr = sc.nextDouble();
		System.out.print("Months: ");
		int monthsBr = sc.nextInt();
		
		InterestService isBr = new BrazilInterestService(2.0);
		double paymentBr = isBr.payment(amountBr, monthsBr);
		
		System.out.println("Payment after " + monthsBr + " months:");
		System.out.println(String.format("%.2f", paymentBr));
		System.out.println();
		
		System.out.print("Amount USA: ");
		double amountUsa = sc.nextDouble();
		System.out.print("Months USA: ");
		int monthsUsa = sc.nextInt();
		
		InterestService isUsa = new UsaInterestService(1.0);
		double paymentUsa = isUsa.paymentUsa(amountUsa, monthsUsa);
		
		System.out.println("Payment USA after " + monthsUsa + " months:");
		System.out.println(String.format("%.2f", paymentUsa));
		System.out.println();
		
		System.out.print("Amount: ");
		double amountChi = sc.nextDouble();
		System.out.print("Months: ");
		int monthsChi = sc.nextInt();
		
		InterestService isChi = new ChinaInterestService(3.0);
		double paymentChi = isChi.paymentUsa(amountChi, monthsChi);
		
		System.out.println("Payment USA after " + monthsChi + " months:");
		System.out.println(String.format("%.2f", paymentChi));
		
		sc.close();
	}
}