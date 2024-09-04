package methods;
import java.util.*;

public class creatingarray {
	public static int[] printing(int t)

	{
		int x[]=new int [t];
		Scanner s=new Scanner(System.in);
		for(int i=0;i<t;i++) {
			System.out.print("enter value");
			x[i]=s.nextInt();
		}
		return x;

	}
	public static void main(String[]args) 
	{
		int n;
		Scanner s=new Scanner(System.in);
		System.out.print("enter the n numbers");
		n=s.nextInt();
		int a[]=new int[n];
		a=printing(n);
		System.out.println("result is:");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
			
	}

}
