package loop;
import java.util.*;

public class starprogram07 
{

	public static void main(String[] args)
	{
		int n;
		Scanner p=new Scanner(System.in);
		System.out.println("enter n");
		n=p.nextInt();
		for (int i=1;i<n;i++)
		{
			for(int j=1;j<n;j++)
			{
				System.out.print("*");	
			}
			   System.out.print("\n");
			
				
			}
		for(int i=n;i>n;i--)
		{
			for (int j=1;j<=i;j++)
			{
				System.out.println("*");
			}
			System.out.print("\n");
		
		}
	}
}