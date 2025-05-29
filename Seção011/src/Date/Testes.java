package Date;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Testes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the initial date? ");
		String data = sc.next();	
		sc.nextLine();
		LocalDate initialDate = LocalDate.parse(data, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		
		System.out.print("What is the final date? ");
		String data2 = sc.next();	
		sc.nextLine();
		LocalDate finalDate = LocalDate.parse(data2, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		
		Duration timeInDays = Duration.between(initialDate.atStartOfDay(), finalDate.atStartOfDay());

		System.out.println(timeInDays.toDays());
	
		sc.close();
	}

}
