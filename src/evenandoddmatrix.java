import java.util.*;
public class evenandoddmatrix
{

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.print("enter the n value ");
		int n=s.nextInt();
		int d[][]=new int[n][n];
		for (int i=0;i<n;i++)
		{
			for (int j=0;j<n;j++)
			{
				System.out.print("enter the value");
				d[i][j]=s.nextInt();
			}
			
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(d[i][j]%2==0)
				{
					System.out.println(d[i][j]+"is even");
				}
				else
				{
					System.out.println(d[i][j]+"is odd");
				}
			}
		}

	}

}
