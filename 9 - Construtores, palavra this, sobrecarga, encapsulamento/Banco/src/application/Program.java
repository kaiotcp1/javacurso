package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Bank;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Bank bank;
		
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		
		System.out.println("Enter account holder: ");
		System.out.print("Holder: ");
		sc.nextLine();
		String holder = sc.nextLine();
		
		System.out.println("Is there na initial deposit (y/n) ?");
		char response = sc.next().charAt(0);
		
		if(response == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			bank = new Bank(number, holder, initialDeposit);
		} else {
			bank = new Bank(number, holder);
		}
		
		System.out.println();
		System.out.println("Account data:");
		System.out.println(bank);
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		bank.deposit(depositValue);
		System.out.println("Update data account: ");
		System.out.println(bank);
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		double withdrawValue = sc.nextDouble();
		bank.withdraw(withdrawValue);
		System.out.println("Update data account: ");
		System.out.println(bank);
		
		
		sc.close();
	}

}
