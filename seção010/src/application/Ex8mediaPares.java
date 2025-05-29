package application;

import java.util.Locale;
import java.util.Scanner;

public class Ex8mediaPares {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos elementos vai ter o vetor? ");
		int n = sc.nextInt();

		double[] vect = new double[n];

		double soma = 0;
		int somaDosNumeros = 0;
		for (int i = 0; i < vect.length; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextDouble();
			if(vect[i]%2==0) {
				soma = soma + vect[i];
				somaDosNumeros++;
				}
		}

		double media = soma / somaDosNumeros;
		if (soma == 0) {
			System.out.println("Nenhum numero par");
		} else {
			System.out.printf("Media numeros par %.1f", media);
		}
		
		
		sc.close();
	}

}
