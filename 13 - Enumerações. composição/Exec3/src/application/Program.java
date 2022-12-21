package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Scanner sc = new Scanner(System.in);
		
		
		// 				Teste
		//Product p1 = new Product("TV", 1000.00);
		//System.out.println(p1);
		//OrderItem oi1 = new OrderItem(4, 1000.00, p1);
		//System.out.println(oi1);
		//Client cli = new Client("Maria", "Maria@gmail;.com", sdf.parse("20/10/2000"));
		//System.out.println(cli);
		//System.out.println(oi1.getProduct());
		//System.out.println(oi1.getProduct().getName());
		
		
		
		System.out.println("Enter client data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.next();
		System.out.print("Birth date (DD/MM/YYYY): ");
		Date birthDate = sdf.parse(sc.next());
		
		Client client = new Client(name, email, birthDate);
		System.out.println(client); // Teste
		System.out.println("Enter order date: ");
		System.out.println("Status: ");
		OrderStatus status = OrderStatus.valueOf(sc.next());
		Order order = new Order(new Date(), status, client);
		
		
		System.out.println("How many items to this order? ");
		int N = sc.nextInt();
		for(int i = 0; i < N; i++) {
			System.out.println("Enter #" + (i+1) + " item data: ");
			System.out.print("Product name: ");
			sc.nextLine(); // buffer entrada...
			String productName = sc.nextLine();
			System.out.println("Product price: ");
			double productPrice = sc.nextDouble();
			System.out.println("Quantity: ");
			int quantity = sc.nextInt();
			
			Product product = new Product(productName, productPrice);
			
			OrderItem it = new OrderItem(quantity, productPrice, product);
			
			order.addItem(it);
		}
		
		System.out.println();
		System.out.println(order);
		
		sc.close();

	}

}
