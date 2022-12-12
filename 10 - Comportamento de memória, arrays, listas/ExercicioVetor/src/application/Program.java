package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quanto numeros você vai digitar? ");
		int n = sc.nextInt();
		
		// vetor
		int[] vet = new int[n];
		
		for (int i = 0; i < vet.length; i++) {
			System.out.println("Digite um numero: ");
			vet[i] = sc.nextInt();
		}
		
		System.out.println("NUMEROES NEGATIVOS: ");
		for (int i = 0; i < vet.length; i++) {
			if (vet[i] < 0) {
				System.out.println(vet[i]);
			}
		}
		
		sc.close();

	}

}
