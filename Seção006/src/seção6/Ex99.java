package seção6;

import java.util.Scanner;

public class Ex99 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int cubo;
		int quadrado;
		for(int i=1;i<=n;i++) {
		      
			  quadrado =  i*i;
		      cubo = i*i*i;
		      System.out.println(i + " " + quadrado + " " + cubo);
		}
		
		
		sc.close();
	}

}
    //	int n = sc.nextInt();

    //  for (int i=1; i<=n; i++) {

	//  int primeiro = i;
    //  int segundo = i * i;
    //  int terceiro = i * i * i;
	//  System.out.printf("%d %d %d%n", primeiro, segundo, terceiro);
    //  }