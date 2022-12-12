package kaio;

import java.util.Scanner;

public class AulaDeCondicoes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int horas;
		
		
		System.out.println("Quantas Horas ?");
		horas = sc.nextInt();
		
		if(horas < 12) {
			System.out.println("Bom dia");
		} else {
			System.out.println("Boa Tarde");
		}	
			sc.close();
	}
}
