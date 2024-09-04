package loop02;
import java.util.*;
public class evenorodd 
{

	public static void main(String[] args)
	{
		int start,end;
		Scanner s=new Scanner(System.in);
		System.out.print("enter the starting no");
		start=s.nextInt();
		System.out.print("enter the ending number");
		end=s.nextInt();
		while(start<=end)
		{
			if(start%2==0)
			{
				System.out.println(start+"is even number");
			}
			else
			{
				System.out.println(start+" is odd number");
			}
			start=start+1;
		}
		

	}

}
