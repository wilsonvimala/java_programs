package oops;
import java.util.Scanner;
 class Big 
{
	int x,y;
	void bigfn(int m,int v)
	{
		x=m;
		y=v;
		if(x>y)
		{
			System.out.println("first value is big ");
			
		}
		else
		{
			System.out.println("second value is big");
		}
	}
}
public class Big2
{
	public static void main(String[]args)
	{
		Big n=new Big();
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		System.out.print("enter the second value");
		int b=s.nextInt();
		n.bigfn(a,b);
	}
	
}
	

			

