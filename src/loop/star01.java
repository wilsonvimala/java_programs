package loop;
import java.util.Scanner;

public class star01 
{

	public static void main(String[] args)
	{
		int n;
		Scanner s=new Scanner(System.in);
		System.out.print("enter the n value");
		n=s.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				System.out.print("*");	
			}
			
				System.out.print("\n");
		}
				
				
		
		

	}

}
