package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import entites.Product;

public class Application {
	public static void main(String [] args) {
		List <Product> list = new ArrayList<>();
		list.add(new Product("Computer",1750.65));
		list.add(new Product("Tv",2450.65));
		list.add(new Product("Tablet",900.00));
		list.add(new Product("Iphone",4500.0));
		
		list.forEach(System.out::println);
		
		System.out.println("---------------------");
		/*
		list.forEach(new PriceUpdate());
		list.forEach(System.out::println);
		*/
		
		//============== LAMBDA ===================
		Consumer<Product>cons = p -> {
			p.setPrice(p.getPrice() * 1.1);
		};
		
		list.forEach(cons);
		list.forEach(System.out::println);
		
		System.out.println("---------------------");
		// ---------OU INLINE ---------
		list.forEach(cons = p -> {
			p.setPrice(p.getPrice() * 1.1);
		});
		
		list.forEach(System.out::println);
	}
}
