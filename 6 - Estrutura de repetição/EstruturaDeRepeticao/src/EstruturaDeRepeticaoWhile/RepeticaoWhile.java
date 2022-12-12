package EstruturaDeRepeticaoWhile;

import java.util.Scanner;

public class RepeticaoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		float a = sc.nextFloat();

		while (a != 0) {
			a = sc.nextInt();
		}
		
		System.out.println("While enterrompido");
		sc.close();
	}

}
