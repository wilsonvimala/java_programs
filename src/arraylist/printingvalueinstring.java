package arraylist;
import java.util.*;
public class printingvalueinstring 
{

	public static void main(String[] args)
	{
		int n;
		Scanner s=new Scanner(System.in);
		System.out.print("enter the n number");
		n=s.nextInt();
		String a[]=new String[n];
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextLine();
			
		}
		System.out.println("result is:");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
			

	}

}
