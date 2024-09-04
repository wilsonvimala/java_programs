import java.util.*;
public class printingvaluematrix 
{

	public static void main(String[] args)
	{  
		Scanner s=new Scanner(System.in);
		System.out.print("enter the value ");
		int n=s.nextInt();
		int b[][]=new int[n][n];
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print("enter the value ");
				b[i][j]=s.nextInt();
				
			}
		}
		for (int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(b[i][j]);
				System.out.print("\t");
			}
			System.out.print("\n");
			
		}
		
				
	

	}

}
