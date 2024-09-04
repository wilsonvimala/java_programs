package loop;
import java.util.*;

public class sumofnnumbers
{

	public static void main(String[] args)
	{
		int n,sum=0;
		Scanner s=new Scanner(System.in);
		System.out.print("enter the no n");
		n=s.nextInt();
	
		for(int i=1;i<=n;i++)
		
		{
			sum+=i;
			
			
		}
		System.out.println("sum of n numbers"+sum);
			
		
		
		

	}

}
