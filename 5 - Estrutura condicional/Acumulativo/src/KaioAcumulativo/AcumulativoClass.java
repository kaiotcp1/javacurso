package KaioAcumulativo;

import java.util.Locale;
import java.util.Scanner;

public class AcumulativoClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int minutos = sc.nextInt();
		
		float conta = 50f;
		if(minutos > 100) {
			conta += (minutos - 100) * 2f;
		}
		System.out.println(conta);
		
		System.out.printf("Valor a pagar é : R$ %.2f%n", conta );
		sc.close();
		
	}

}
