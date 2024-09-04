package methods;

import java.util.Scanner;

public class addingtwo 
{
	static void adding(int x,int y)
	{
		int z;
		z=x+y;
		System.out.println("sum of two numbers is"+z);
	}

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.print("enter the first value:");
		int a=s.nextInt();
		System.out.print("enter the second value");
		int b=s.nextInt();
		adding(a,b);

	}

}
