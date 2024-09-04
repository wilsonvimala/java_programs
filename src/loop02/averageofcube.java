package loop02;
import java.util.*;
public class averageofcube
{

	public static void main(String[] args) 
	{
		int n,sum=1,x;
		float avg;
		Scanner s=new Scanner(System.in);
		System.out.print("enter the n number");
		n=s.nextInt();
		int i=1;
		do
		{
			x=i*i*i;
			sum=sum*x;
			i=i+1;
			
		}
		while(i<n);
		avg=sum/n;
		System.out.print("average of cube is "+avg);
		

	}

}
