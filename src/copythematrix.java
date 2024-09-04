import java.util.*;
public class copythematrix 
{

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter n value");
		int n=s.nextInt();
		int b[][]=new int[n][n];
		for (int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print("enter the value");
				b[i][j]=s.nextInt();
				
			}
		}
		int file[][]=new int[n][n];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++);
			
			
		}
		System.out.println("current matrix is"+Arrays.deepToString(b));
		System.out.println("copy matrix is"+Arrays.deepToString(file));
		{
			
		}
		
		

	}

}
