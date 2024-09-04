package loop02;
import java.util.*;
public class averagecube
{

	public static void main(String[] args) 
	{
		int n,sum=1,x;
		float avg;
		Scanner s=new Scanner(System.in);
		System.out.print("enter the n number ");
		n=s.nextInt();
		int i=1;
		while(i<=n)
		{
			x=i*i*i;
			sum=sum*x;
			i=i+1;
					
					
					
					
					
					
					
					
					
		}
		avg=sum/n;
		System.out.print("averge of cube is "+avg);

	}

}
