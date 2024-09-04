package loop;
import java.util.*;

public class starpattern04
{

	public static void main(String[] args)
	{
		int n;
		Scanner k=new Scanner(System.in);
		System.out.print("enter the value n");
		n=k.nextInt();
		for( int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
				
			}
			for(int K=i;K<=n;K++)
			{
				System.out.print("*");
				
			}
			{
				System.out.print("\n");
			}
				
				
		}

	}

}
