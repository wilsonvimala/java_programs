import java.util.*;
public class arrayoperation 
{
	public static void printing(int x[] ) {
		System.out.println("result is:");
		for(int i=0;i<x.length;i++)
		{
			System.out.println(x[i]);
		}
	}

	public static void main(String[] args) 
	{
		int n;
		Scanner s=new Scanner(System.in);
		System.out.print("enter the n number");
		n=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			System.out.print("enter the value");
			a[i]=s.nextInt();
			
		}
		printing(a);
				

	}

}

