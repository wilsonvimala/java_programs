package loop;

import java.util.Scanner;

public class tinue 
{

	public static void main(String[] args)
	{
		int start,end,k;
		Scanner s=new Scanner(System.in);
		System.out.println("enter starting value");
		start=s.nextInt();
		System.out.println("enter ending value");
		end=s.nextInt();
		System.out.println("enter searching value");
		k=s.nextInt();
		for(int i=start;i<=end;i++) {
			
			if (i==k) 
			{
				continue;
			
				
			}
			System.out.println(i);
		}

	}

}
