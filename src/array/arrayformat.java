package array;
import java.util.*;
public class arrayformat 
{

	public static void main(String[] args) 
	{
		int n;
		Scanner u=new Scanner(System.in);
		System.out.print("enter the n number");
		n=u.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			System.out.print("enter the value");
			a[i]=u.nextInt();
			
		}
		System.out.println("result is:");
		System.out.println(Arrays.toString(a));
	}
	
}
