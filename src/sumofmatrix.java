import java.util.*;
public class sumofmatrix
{

	public static void main(String[] args) 
	{
		Scanner k=new Scanner(System.in);
		int sum=0;
		System.out.print("enter the value");
		int n=k.nextInt();
		int a[][]=new int[n][n];
		for(int i=0;i<n;i++) 
		{
			for( int j=0;j<n;j++)
			{
				System.out.print("enter the value ");
				a[i][j]=k.nextInt();
				
			}
			
		}
		for(int i=0;i<n;i++) 
		{
			for (int j=0;j<n;j++)
			{
				sum=sum+a[i][j];
			}
				
		}
		System.out.print("sum of matrix is "+sum);
		
				
 
	}

}
