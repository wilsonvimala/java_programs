import java.util.*;
public class transposematrix 
{

	public static void main(String[] args) 
	{
		Scanner k=new Scanner(System.in);
		System.out.println("enter n value");
		int n=k.nextInt();
		int c[][]=new int[n][n];
		for (int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print("enter the value");
				c[i][j]=k.nextInt();
				
			}
		}
		{
			for(int i=0;i<n;i++)
			{
				for(int j=0;j<n;j++)
				{
					System.out.print(c[j][i]);
					System.out.print("\t");
				}
				System.out.print("\n");
			}
			
		}
		
		
			

	}

}
