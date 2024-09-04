package array;
import java.util.*;

public class updatingarray 
{

	public static void main(String[] args) 
	{
		int n,x,y;
		Scanner s=new Scanner(System.in);
		System.out.print("entet the  number");
		n=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<a.length;i++)
		{
			System.out.print("enter the value");
			a[i]=s.nextInt();
		}
		System.out.println("array is");
		System.out.println(Arrays.toString(a));
		System.out.print("enter particular value");
		x=s.nextInt();
		for (int i=0;i<n;i++)
		{
			if (x==a[i])
			{
				a[i]=y;
			}
			
			}
		
		}
	    System.out.println("update Array is");
	    System.out.println(Arrays.toString(a);

	}
}
