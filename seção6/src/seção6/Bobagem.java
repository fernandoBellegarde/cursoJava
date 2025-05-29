package seção6;

import java.util.Scanner;

public class Bobagem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println();
		System.out.print("O Fernando é seu filho preferido? ");
		String resp = sc.nextLine();
		System.out.println();

		String sim = "sim"; 

		if (resp.equalsIgnoreCase(sim)) { 
			System.out.print("Eu já sabia, mãe! Obrigado, te amo <3");
		} else {
			do {
				System.out.println("Tente de novo!");
				System.out.print("Eu sou seu filho preferido? ");
				resp = sc.nextLine();
				System.out.println();
			} while (!resp.equalsIgnoreCase(sim)); 
			System.out.print("Eu já sabia, mãe! Obrigado, te amo <3");
		} 

		sc.close();
	}

}
