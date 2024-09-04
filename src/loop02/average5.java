package loop02;
import java.util.*;
public class average5 
{

	public static void main(String[] args)
	{
		int a,b,c,d,e,n,sum;
		float avg;
		Scanner s=new Scanner(System.in);
		System.out.print("enter the n");
		n=s.nextInt();
		int i=1;
		while(i<=1)
		{
			System.out.print("enter the 1");
			a=s.nextInt();
			System.out.print("enter the 2");
			b=s.nextInt();
			System.out.print("enter the 3");
			c=s.nextInt();
			System.out.print("enter the 4");
			d=s.nextInt();
			System.out.print("enter the 5");
			e=s.nextInt();
			sum=a+b+c+d+e;
			avg=sum/n;
			System.out.print("avg of 5 is"+avg);
			i=i+1;
		}

	}

}
