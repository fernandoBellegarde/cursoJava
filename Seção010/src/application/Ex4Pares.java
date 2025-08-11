package application;

import java.util.Locale;
import java.util.Scanner;

public class Ex4Pares {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos números vc vai digitar? ");
		int n = sc.nextInt();
		
		int[] vect = new int[n];
		
		for(int i=0;i<vect.length;i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextInt();
		}
		
		System.out.println("NUMEROS PARES: ");
		
		int quantidadeDePares = 0;
		for(int i=0;i<vect.length;i++) {
			if(vect[i]%2==0) {
				System.out.printf("%d ", vect[i]);
				quantidadeDePares++;
			}
		}
		System.out.println();
		System.out.println();
		System.out.println("QUANTIDADE DE PARES = " + quantidadeDePares); 
		
		
		
		sc.close();

	}

}