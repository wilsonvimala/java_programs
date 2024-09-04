import java.util.*;
public class indexofsmallestvalue 
{

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.print("enter  n value");
		int n=s.nextInt();
		int d[][]=new int[n][n];
		for (int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print("enter the value");
				d[i][j]=s.nextInt();
			}
		}
		int x=d[0][0];
		int row=0;
		int col=0;
		for(int i=0;i<n;i++)
		
		{
			for(int j=0;j<n;j++)
			{
				if(x>d[i][j])
				{
					row=i;
					col=j;
				}
			}
		}
		System.out.println("Smallest element row is "+row+"column is"+col)

	}

}
