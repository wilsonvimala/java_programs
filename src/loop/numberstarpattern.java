package loop;

import java.util.*;
public class numberstarpattern 
{

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int n;
		System.out.print("enter the no");
		n=s.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j<=n;j++)
				
			{
			System.out.print(" ");	
			}
			for(int k=1;k<=i;k++)
				
			{
			System.out.print(k);	
			}
			System.out.print("\n");
		
		}
		

	}

}
