package methods;
import java.util.*;
public class sumofarray {
	public static int sum(int x[])
	{
		int r=0;
		for(int i=0;i<x.length;i++)
		{
			r=r+x[i];
		}
		return r;
	}

	public static void main(String[] args) 
	{
		int n,t;
		Scanner s=new Scanner(System.in);
		System.out.print("enter the n number ");
		n=s.nextInt();
		int a[]=new int[n];
		for (int i=0;i<n;i++)
		{
			System.out.print("enter the value");
			a[i]=s.nextInt();
		}
		 t=sum(a);
		System.out.println("sum of array is"+t);
				
	}	

	
}

