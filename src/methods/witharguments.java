package methods;
import java.util.*;
public class witharguments 
{
	static void add(int x,int y)
	{
		int z;
		z=x+y;
		System.out.print("sum of two numbers is "+z);
	}
	static void mul(int x,int y)
	{
		int z;
		z=x-y;
		System.out.println("product of two number"+z);
	}
	static void divide(int x,int y)
	{
		int z;
		z=x*y;
		System.out.println("divide of two numbers is"+z);
	}
	public static void main(String[]args)
	{
		Scanner s=new Scanner(System.in);
		System.out.print("enter the first value");
		int x=s.nextInt();
		System.out.print("enter the secod value");
		int y=s.nextInt();
		add(x,y);
		mul(x,y);
		divide(x,y);
		
	}


	

}
