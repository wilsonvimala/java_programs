import java.util.*;
public class smallest 
{

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.print("enter  n value");
		int n=s.nextInt();
		int d[][]=new int[n][n];
		for (int i=0;i<n;i++)
		{
			for (int j=0;j<n;j++)
			{
				System.out.print("enter the value ");
				 d[i][j]=s.nextInt();
				
			}
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.println(d[i][j]);
				System.out.print("\t");
				
			}
			System.out.println("\n");
			
			
		}
		System.out.print("Smallest value in column");
		for(int i=0;i<n;i++)
		{
			int x=d[0][i];
			for(int j=0;j<n;j++)
			{
				if (x>d[j][i]);
				{
					x=d[j][i];
				}
	
				
			}
			System.out.print(x);
			System.out.print("\t");
		}
				
		
				

	}

}
