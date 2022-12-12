package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LocalDate d04 = LocalDate.parse("2022-07-20");
		LocalDateTime d05 = LocalDateTime.parse("2022-06-12T13:43:23");
		Instant d06 = Instant.parse("2022-12-06T13:46:23Z");
		Instant d07 = Instant.parse("2022-12-20T01:30:26Z");


		
		LocalDate r1 = LocalDate.ofInstant(d07, ZoneId.systemDefault());
		LocalDate r2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));
		
		System.out.println("d04 dia = " + d05.getDayOfMonth());
		System.out.println("d04 mês = " + d04.getMonthValue());
		System.out.println("d04 ano = " + d04.getYear());
		
		System.out.println("d05 hora = " + d05.getHour());
		System.out.println("d05 Minuto = " + d05.getMinute());




		System.out.println("r1 = " + r1);
		System.out.println("r2 = " + r2);
	}

}
