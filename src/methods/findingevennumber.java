package methods;
import java.util.Scanner;
public class findingevennumber
{
	public static void even(int x[])
	{
		System.out.println("result is:");
		for(int i=0;i<x.length;i++)
		{
			if(x[i]%2==0) {
				System.out.println(x[i]+" is even");
			}
			else
			{
				System.out.println(x[i]+" is odd");
				
			}
		}
	}

	public static void main(String[] args)
	
	{
		int n;
		Scanner s=new Scanner(System.in);
		System.out.print("enter the n numbe ");
		n=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			System.out.print("enter value");
			a[i]=s.nextInt();
		}
		even(a);
		

	}

}
