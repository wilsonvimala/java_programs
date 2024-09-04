import java.util.*;
public class evenoroddcountinmatrix 
{

	public static void main(String[] args) 
	{
	int ecount=0,ocount=0;
	Scanner k=new Scanner(System.in);
	System.out.print("enter n value");
	int n=k.nextInt();
	int a[][]=new int [n][n];
	for (int i=0;i<n;i++)
	{
		for(int j=0;j<n;j++)
		{
			System.out.print("enter the value");
			a[i][j]=k.nextInt();
		}
	}
	for(int i=0;i<n;i++)
	{
		for (int j=0;j<n;j++)
		{
			if(a[i][j]%2==0)
			{
				ecount=ecount+1;
			}
			else
			{
				ocount=ocount+1;
			}
		}
	}
	System.out.println("even count is "+ecount);
	System.out.println("odd count is "+ocount);
	
	
			

	}

}
