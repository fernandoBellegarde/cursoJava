package application;

import java.util.Locale;
import java.util.Scanner;

public class Ex6SomaDeVetor {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos valores vai ter cada vetor? ");
		int n = sc.nextInt();

		int[] vect1 = new int[n];
	
		System.out.println("Digite os valores do vetor A:");
		for(int i=0;i<vect1.length;i++) {
			vect1[i] = sc.nextInt();		
			}

		int[] vect2 = new int[n];

		System.out.println("Digite os valores do vetor B:");
		for(int i=0;i<vect2.length;i++) {
			vect2[i] = sc.nextInt();		
			}
		
		System.out.println("VETOR RESULTANTE:");
		
		
		for(int i=0;i<n;i++) {
			int soma = vect1[i] + vect2[i];
			System.out.println(soma);
		}
		
		sc.close();
	}

}
