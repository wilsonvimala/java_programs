package loop;
import java.util.*;
public class numberpattern 
{

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n;
		System.out.print("enter a value");
		n=s.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
			System.out.print(j);	
			}
			System.out.print("\n");
		}

	}

}
