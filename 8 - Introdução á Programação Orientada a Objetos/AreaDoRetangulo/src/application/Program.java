package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Quadrado;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Quadrado quadrado = new Quadrado();
		
		System.out.println("Base do quadrado: ");
		quadrado.width = sc.nextDouble();
		
		System.out.println("Altura do quadrado");
		quadrado.height = sc.nextDouble();
		
		System.out.printf("Area do quadrado é: %.2f%n", quadrado.area());
		System.out.printf("Perimetro do quadrado é: %.2f%n", quadrado.perimeter());
		System.out.printf("Diagonal do quadrado é: %.2f%n", quadrado.diagonal());
	}

}
