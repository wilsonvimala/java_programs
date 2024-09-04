package array;
import java.util.*;
public class evenoroddd
{

	public static void main(String[] args)
	{
		int n,ec=0,oc=0;
		Scanner s=new Scanner(System.in);
		System.out.print("enter the n number ");
		n=s.nextInt();
		int a[]=new int[n];
		for (int i=0;i<a.length;i++)
		{
			System.out.print();
			if(a[i]%2==0)
			{
				ec++;
			}
				
		
		
			
		
		else
		{
			oc++;
		}
		System.out.println("even count is "+ec);
		System.out.println(" odd count is"+oc);
		}
	}
}


