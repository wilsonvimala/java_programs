package loop;
import java.util.*;
public class starprogram
{

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n;
		System.out.print("enter the value n");
		n=s.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
				
			}
			System.out.print("\n");
		}
			
		
		

	}

}
