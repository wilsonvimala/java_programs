package methods;
import java.util.*;
public class printingarrayvalue {
	public static int[] printing(int t) {
		int x[]=new int[t];
		Scanner s=new Scanner(System.in);
		for(int i=0;i<t;i++)
		{
			System.out.print("enter value");
			x[i]=s.nextInt();
		}
		return x;
	}
	static void display 
	(int m[])
	{
		System.out.println("Result is");
		for (int i=0;i<m.length;i++)
		{
			System.out.println(m[i]);
		}
	}


	public static void main(String[] args) 
	{
		int n;
		Scanner s=new Scanner(System.in);
		System.out.print("enter the n number");
		n=s.nextInt();
		int a[]=new int[n];
		a=printing(n);
	    display(a);
		
	}

}
