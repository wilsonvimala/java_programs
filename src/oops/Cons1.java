package oops;

import java.util.Scanner;

public class Cons1 {
	
	public static void main(String[] args) 
	{
		Scanner s= new Scanner(System.in);
		System.out.print("enter the first value");
		int a=s.nextInt();
		System.out.print("enter the second value");
		int b=s.nextInt();
		PConst n=new PConst(a,b);
		n.add();
	}
}
