package application;

import java.io.File;
import java.util.Scanner;

public class EncontarArquivosPastas {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a folder path: ");
		String strPath = sc.nextLine();
		
		File path = new File(strPath);
		
		System.out.println("getName: " + path.getName());
		System.out.println("getParent: " + path.getParent());
		System.out.println("getPath: " + path.getPath());
	
		//Tem outras funções se digitar ".get", essas que o nélio mostrou são apenas as principais
		
		// D:/Trabalho/inn
		
		sc.close();
	}
}
