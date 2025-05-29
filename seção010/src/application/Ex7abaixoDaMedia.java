package application;

import java.util.Locale;
import java.util.Scanner;

public class Ex7abaixoDaMedia {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();

		double[] vect = new double[n];

		double soma = 0;
		for (int i = 0; i < vect.length; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextDouble();
			soma = soma + vect[i];
		}

		double media = soma / n;

		System.out.printf("MEDIA DO VETOR = %.3f%n", media);
		System.out.println("ELEMENTOS ABAIXO DA MEDIA:");

		for (int i = 0; i < n; i++) {
			if (vect[i] < media) {
				System.out.printf("%.1f%n", vect[i]);
			}
		}

		sc.close();
	}

}
