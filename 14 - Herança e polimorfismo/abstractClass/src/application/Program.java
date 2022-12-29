package application;

import java.util.ArrayList;
import java.util.List;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// EM NIVEL DE COMPILAÇÃO, NÃO PODERA INSTANCIAR A CLASSE ACCOUNT
		// Account acc1 = new Account(1001, "Alex", 1000.0);
		Account acc2 = new SavingsAccount(1002, "Kaio", 350.0, 0.01);
		Account acc3 = new BusinessAccount(1003, "Maria", 1000.0, 500.0);
		Account acc4 = new BusinessAccount(1004, "Karen", 1200.0, 500.0);

		List<Account> list = new ArrayList<>();
		list.add(acc2);
		list.add(acc3);
		list.add(acc4);

		double sum = 0.0;
		for (Account acc : list) {
			sum += acc.getBalance();
		}

		System.out.printf("Total balance: %.2f%n", sum);

		for (Account teste : list) {
			teste.deposit(10.0);
		}

		for (Account teste2 : list) {
			System.out.println("Accout balance:  " + teste2.getBalance() + "Name: " + teste2.getHolder());
		}

		System.out.println();

	}

}
