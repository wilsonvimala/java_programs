package loop;
import java.util.*;

public class average 

{

	public static void main(String[] args) 
	{
	int a,b,c,d,e,n,sum;
	float avg;
	Scanner s=new Scanner(System.in);
	System.out.println("enter no n:");
	n=s.nextInt();
	for(int i=1;i<=n;i++)
	{
		System.out.println("enter no a:");
		a=s.nextInt();
		System.out.println("enter no b:");
		b=s.nextInt();
		System.out.println("enter no c:");
		c=s.nextInt();
		System.out.println("enter no d:");
		d=s.nextInt();
		System.out.println("enter no e:");
		e=s.nextInt();
		sum=a+b+c+d+e;
		avg=sum/5;
		System.out.println("average"+avg);
		
		
	}
		
		
		
	
	
	
	
		
		

	}

}
