package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;



public class Program5 {

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		
		Set<Integer> cA = new HashSet<>();
		Set<Integer> cB = new HashSet<>();
		Set<Integer> cC = new HashSet<>();

		System.out.print("How many students for course A? ");
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			int number = sc.nextInt();
			cA.add(number);
		}
		
		System.out.print("How many students for course B? ");
		int m = sc.nextInt();
		
		for(int i=0; i<m; i++) {
			int number = sc.nextInt();
			cB.add(number);
		}
		
		System.out.print("How many students for course C? ");
		int o = sc.nextInt();
		
		for(int i=0; i<o; i++) {
			int number = sc.nextInt();
			cC.add(number);
		}
		
		Set<Integer> total = new HashSet<>(cA);
		total.addAll(cB);
		total.addAll(cC);

		System.out.println("Total students: " + total.size());
	
		sc.close();
	}

}
