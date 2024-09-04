package methods;
import java.util.*;
public class findingleap {
	public static void leap(int x[])
	{
		System.out.println("result is:");
		for(int i=0;i<x.length;i++)
		{
			if(x[i]==0)
			{
				System.out.println(x[i]+" is leap year");
			}
			else
			{
				System.out.println(x[i]+"is not leap year");
			}
		}
	}

	public static void main(String[] args) {
		int n;
		Scanner s=new Scanner(System.in);
		System.out.print("enter the n number ");
		n=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			System.out.print("enter the value");
			a[i]=s.nextInt();
			
		}
			leap(a);

	}

}
