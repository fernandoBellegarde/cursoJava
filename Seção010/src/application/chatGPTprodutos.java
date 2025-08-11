package application;

import java.util.Locale;
import java.util.Scanner;

import enttities.Produtos;

public class chatGPTprodutos {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("How many products will be registered? ");
		int n = sc.nextInt();
		sc.nextLine(); // Consumir quebra de linha pendente após nextInt()

		Produtos[] vect = new Produtos[n];

		for (int i = 0; i < vect.length; i++) {
			System.out.println();
			int idProduct = i + 1;
			System.out.println("Product ID: " + idProduct);

			System.out.print("Name: ");
			String nameProduct = sc.nextLine();

			System.out.print("Price: ");
			double priceProduct = sc.nextDouble();

			System.out.print("Quantity in stock: ");
			int quantityStock = sc.nextInt();
			sc.nextLine(); // Consumir quebra de linha pendente após nextInt()

			Produtos pro = new Produtos(idProduct, nameProduct, priceProduct, quantityStock);
			vect[i] = pro;
		}

		// Exibir produtos cadastrados
		System.out.println("\nRegistered Products:");
		for (int i = 0; i < vect.length; i++) {
			if (vect[i] != null) {
				System.out.println("ID:"+i+1 + "" + vect[i]);
			}
		}

		sc.close();
	}

}
