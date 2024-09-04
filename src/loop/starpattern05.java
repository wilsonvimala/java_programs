package loop;
import java.util.*;
public class starpattern05 
{

	public static void main(String[] args) 
	{
		Scanner p=new Scanner(System.in);
		int n;
		System.out.print("enter a value n");
		n=p.nextInt();
		for(int i=1;i<n;i++)
		{
			for(int j=i;j<=n;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
				
			}
			{
			System.out.print("\n");
			}
			
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
				
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			{
	           System.out.print(n/*);
