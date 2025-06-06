package application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class EscritaEmArquivos {
	public static void main(String[] args) {
	
		String[] lines = new String[] { "Good morning", "Good afternoon", "Good night" };
		String path = "D:\\trabalho\\out.txt";
	/*
		• Cria/recria o arquivo: new FileWriter(path)
		• Acrescenta ao arquivo existente: new FileWriter(path, true)
	*/	
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
			for (String line : lines) {
				bw.write(line);
				bw.newLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}