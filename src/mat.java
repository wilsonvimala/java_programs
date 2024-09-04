import java.util.*;
public class mat {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.print("enter n value ");
		int n=s.nextInt();
		int a[][]=new int[n][n];
		for (int i=0;i<n;i++)
		{
			for (int j=0;j<n;j++)
			{
				System.out.print("enter the value ");
				a[i][j]=s.nextInt();
				
			}
		}
		System.out.print("enter the n vale ");
		int x=s.nextInt();
		int b[][]=new int[x][x];
		for (int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print("enter the value ");
				b[i][j]=s.nextInt();
			}
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++) 
			{
				
				System.out.print(a[i][j]);
				System.out.print("\t");
				
			}
			System.out.print("\n");
		}
		System.out.print("\n");
		System.out.print("\n");
		for(int i=0;i<n;i++)
		{
			for (int j=0;j<n;j++) {
				System.out.print(b[i][j]);
				System.out.print("\t");
				
			}
			System.out.print("\n");
		}
		int c[][]=new int [x][x];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				c[i][j]=a[i][j]=b[i][j];
			}
		}
		System.out.print("subtraction of 2 matrices ");
		System.out.print("\n");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++) {
				System.out.print(c[i][j]);
				System.out.print("\t");
			}
			System.out.print("\n");
				
			}
		}
	}


