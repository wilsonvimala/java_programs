package functional;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class Predicated6 {

	public static void main(String[] args) {
		ArrayList<Product> pro = new ArrayList<Product>();
		Product p1 = new Product();
		Product p2 = new Product();
		Scanner s = new Scanner(System.in);
		System.out.println("enter the Product name");
		String pname = s.next();
		System.out.println("enter the vendor name");
		String vname = s.next();
		System.out.println("enter the price");
		int amount = s.nextInt();
		p1.setName(pname);
		p2.setVendor(vname);
		p1.setPrice(amount);
		System.out.println("enter the product name");
		String pname1 = s.next();
		System.out.println("enter the vendor name");
		String vname1 = s.next();
		System.out.println("enter the price");
		int amount1 = s.nextInt();
		p2.setName(pname1);
		p2.setVendor(vname1);
		p2.setPrice(amount1);
		pro.add(p1);
		pro.add(p2);
		find(pro, m -> m.getPrice() > 20000);
		find(pro, m -> m.getPrice() == 7000);
	}
	private static void find(List<Product>pro,Predicate<Product>predicate) {
		for(Product p:pro) {
			if(predicate.test(p)) {
				System.out.println(p.getName());
			}
		}
	}

}
