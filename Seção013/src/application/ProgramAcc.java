package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class ProgramAcc {

	public static void main(String[] args) {

		Account acc = new Account(1000, "Nando", 1000.0);
		acc.withdraw(200.0);
		System.out.println(acc.getBalance());
	
		Account acc1 = new SavingsAccount(1001, "Allan", 1000.0, 0.1);
		acc1.withdraw(200.0);
		System.out.println(acc1.getBalance());

		Account acc2 = new BusinessAccount(1002, "Caio", 1000.0, 500.0);
		acc2.withdraw(200.0);
		System.out.println(acc2.getBalance());
	}

}
