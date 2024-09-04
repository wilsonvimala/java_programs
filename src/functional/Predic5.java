package functional;
import java.util.ArrayList;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Predic5 {

	public static void main(String[] args)
	{
      List<Product>pro=new ArrayList<Product>();
      Product p1=new Product();
      Product p2=new Product();
      Scanner s=new Scanner(System.in);
        System.out.println("enter the product name");
        String name=s.next();
        System.out.println("enter the vendor name");
        String vendor=s.next();
        System.out.println("enter the price");
        int price=s.nextInt();
        System.out.println("enter the year");
        int year1=s.nextInt();
        p1.setName(name);
        p1.setVendor(vendor);
        p1.setPrice(price);
        p1.setYear(year1);
        System.out.println("enter the product name");
        String pname1=s.next();
        System.out.println("enter the vendor name");
        String vname1=s.next();
        System.out.println("enter the price");
        int amount1=s.nextInt();
        System.out.println("enter the year");
        int year2=s.nextInt();
        p2.setName(pname1);
        p2.setVendor(vname1);
        p2.setPrice(amount1);
        p2.setYear(year2);
        pro.add(p1);
        pro.add(p2);
        find(pro);
        findvendor(pro);
        
        
        
	}
	private static void find(List<Product>pro) 
	{
		System.out.println("above 20000 price product");
		for(Product p:pro)
		{
			if(p.getPrice()>20000)
			{
				System.out.println(p.getName());
			}
		}
	}
   private static void findvendor(List<Product>pro)
   {
	   System.out.println("2021 year products");
	   for(Product p:pro)
	   {
		   if(p.getYear()==2021)
		   {
			   System.out.println(p.getName());
		   }
	   }
   }
}
