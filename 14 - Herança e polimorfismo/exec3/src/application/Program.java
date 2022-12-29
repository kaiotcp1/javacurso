package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPlayer;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<TaxPlayer> list = new ArrayList<>();
		
		System.out.println("Enter the number of taxplayers: ");
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++) {
			System.out.println("Taxplayer #" + i + " data: ");
			System.out.print("Individual or company (i/c)? ");
			char type = sc.next().charAt(0);
			System.out.print("Name: ");
			String name = sc.next();
			System.out.println("Anual income: ");
			Double anualIncome = sc.nextDouble();
			
			if(type == 'i') {
				System.out.print("Health expenditures: ");
				double healthExpenditures = sc.nextDouble();
				list.add(new Individual(name, anualIncome, healthExpenditures));
			} else {
				System.out.print("Number of employees: ");
				Integer numberOfEmployees = sc.nextInt();
				list.add(new Company(name, anualIncome, numberOfEmployees));
			}

		}
		
		System.out.println(); // QUEBRA DE LINHA
		System.out.println("TAXES PAID: ");

		for(TaxPlayer tp : list) {
			System.out.println(tp.getName() + " : $ " + String.format("%.2f", tp.tax()));
		}
		
		double sum = 0.0;
		for(TaxPlayer tp : list) {
			sum += tp.tax();
		}
		System.out.println("TOTAL TAXES: $ " + String.format("%.2f", sum));

		sc.close();
	}

}
