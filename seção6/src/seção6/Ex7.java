package seção6;

import java.util.Locale;
import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		
		for(int i=0;i<n;i++) {
		   double x = sc.nextInt();
		   double y = sc.nextInt();
		   
		   if(y != 0) {
			   double divisao = x/y;
			   System.out.print(divisao);
		   } else {
			   System.out.println("divisao impossivel");
		   }
		}
		
		
		
		
		
		sc.close();
	}

}
