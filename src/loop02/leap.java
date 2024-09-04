package loop02;
import java.util.*;
public class leap
{

	public static void main(String[] args) 
	{
		int x,n;
		Scanner s= new Scanner(System.in);
		System.out.print("enter n numbers");
		n=s.nextInt();
		int i=1;
		while(i<=n)
		{
			System.out.print("enter the year");
			x=s.nextInt();
			if(x%4==0)
			{
				
				if (x%4==0)
				{
					System.out.println(x+"is leap year");
				}
				else
				{
					System.out.println(x+"is not a leap year");
				}
				i=i+1;
			}
			
		}

	}

}
