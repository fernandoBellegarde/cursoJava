package application;

import java.util.Locale;
import java.util.Scanner;

public class Ex9MaisVelho {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Quantas pessoas serao digitadas? ");
		int n = sc.nextInt();

		String[] nomes = new String[n];
		int[] idades = new int[n];
	

		for (int i = 0; i < n; i++) {
			System.out.printf("Dados da %da pessoa:\n", i + 1);
			System.out.print("Nome: ");
			nomes[i] = sc.next();

			System.out.print("Idade: ");
			idades[i] = sc.nextInt();
		}
		
		double maior = idades[0];	
		int posicaoMaior = 0;
		for (int i = 1; i < n; i++) {
			if (idades[i] > maior) {
				maior = idades[i];
				 posicaoMaior = i;
			}
		}
			
		System.out.print("Pessoa mais velha = " + nomes[posicaoMaior]);	
			
			sc.close();
		}
	}


