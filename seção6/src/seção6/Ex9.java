package seção6;

import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
	
		for (int i=0;i<n;i++) {
			 if (n%2 == 0) {
				 System.out.println(i);
			 }
		}
		
		
		
		sc.close();
	}

}
