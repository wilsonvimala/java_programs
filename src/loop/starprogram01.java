package loop;
import java.util.*;

public class starprogram01 
{

	public static void main(String[] args)
	{
		Scanner h=new Scanner(System.in);
		int n;
		System.out.print("enter the n");
		n=h.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j<=n;j++);
			{
				System.out.print(" ");
			}
			for (int k=1;k<=i;k++)
			{
				System.out.print("*");
				
			}
			System.out.print("\n");
		}
				
	}

}
