package loop02;
import java.util.*;
public class cubeofn
{

	public static void main(String[] args)
	{
		
		int n,sum=1,x;
		Scanner s=new Scanner(System.in);
		System.out.print("enter the n numbet ");
		n=s.nextInt();
		int i=1;
		while(i<=n)
		{
			x=i*i*i;
			sum=sum*x;
			i=i+1;
					
		}
		System.out.print("sum of square"+sum);

	}

}
