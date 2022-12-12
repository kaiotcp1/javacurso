package application;

import java.util.ArrayList;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		List<String> list = new ArrayList<>();
		
		list.add("Maria");
		list.add("Maikon");
		list.add("Kaio");
		list.add("sadsadsad");
		list.add("M2dasd");
		list.add(2, "Marco");
		
		System.out.println(list.size());
		list.remove("Kaio");
		// list.removeIf(x -> x.charAt(0) == 'M');

		for(String x : list) {
			System.out.println(x);
		}
		
		System.out.println("Index of Bob: " + list.indexOf("Marco"));
		

		
		
		
		
		
		
	}

}
