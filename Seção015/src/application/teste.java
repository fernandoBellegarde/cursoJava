package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class teste {
	
	public static void main(String[] args){
	
		/*
		String str = "I love Java";
		String[] words = str.split(" ");
		
		for (String word : words) {
			System.out.println(word);
		}
		*/
		String path = "D:\\Trabalho\\product.csv.txt";
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			String line = br.readLine();
			while(line != null) {
				System.out.println(line);
				line = br.readLine();
				
			}
			
		} catch(IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}