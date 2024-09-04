import java.util.Scanner;
public class sumofevenandoddd
{

	public static void main(String[] args) 
	{
		int esum=0,osum=0;
		Scanner s=new Scanner(System.in);
		System.out.print("enter n value ");
		int n=s.nextInt();
		int a[][]=new int[n][n];
		for (int i=0;i<n;i++)
		{
			for (int j=0;j<n;j++)
			{
				System.out.print("enter the value");
				a[i][j]=s.nextInt();
			}
			
			
		}
		for(int i=0;i<n;i++)
		{
			for (int j=0;j<n;j++)
			{
				if(a[i][j]%2==0)
				{
					esum=esum+a[i][j];
				}
				else
				{
					osum=osum+a[i][j];
				}
			
				
			}
			
		}
		System.out.println("sum of odd numbers"+osum);
		System.out.print("sum of even numbers"+esum);
	}

}
