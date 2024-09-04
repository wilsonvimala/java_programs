package loop02;
import java.util.*;

public class cubeofnum 
{

	public static void main(String[] args) 
	{
		int n,sum=1,x;
		Scanner s=new Scanner(System.in);
		System.out.print("enter the n number");
		n=s.nextInt();
		int i=1;
		do
		{
			x=i*i*i;
			sum=sum*x;
			i=i+1;
			
		}while(i<=n);
		System.out.print("sum of square is "+sum);
		

	}

}
