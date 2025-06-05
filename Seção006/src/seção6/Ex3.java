package seção6;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int alco = 0, gaso = 0, dies = 0;
		int x = sc.nextInt();

		while (x != 4) {
			if (x == 1) {
				alco = alco + 1;
			} else if (x == 2) {
				gaso = gaso + 1;
			} else if (x == 3) {
				dies = dies + 1;
			}
			x = sc.nextInt();
		}
	
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + alco);
		System.out.println("Gasolina: " + gaso);
		System.out.println("Diesel: " + dies);

		sc.close();
	}

}
