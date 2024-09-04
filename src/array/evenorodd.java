package array;
import java.util.*;
public class evenorodd {

	public static void main(String[] args) 
	{
		int n;
		Scanner s=new Scanner(System.in);
		System.out.print("enter the n number ");
		n=s.nextInt();
		int a[]=new int[n];
		for (int i=0;i<n;i++)
		{
			System.out.print("enter value");
			a[i]=s.nextInt();
			
			
		}
		for(int i=0;i<a.length;i++)
		{if(a[i]%2==0) {
			System.out.println(a[i]+"is even");
		}
		else
		{
			System.out.println(a[i]+"is odd");
		}
			
		}

	}

}
