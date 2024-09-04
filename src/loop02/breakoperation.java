package loop02;
import java.util.*;

public class breakoperation
{

	public static void main(String[] args) 
	{
		int start,end,k;
		Scanner s=new Scanner(System.in);
		System.out.print("enter the starting value");
		start=s.nextInt();
		System.out.print("enter ending value ");
		end=s.nextInt();
		System.out.println("Searching number");
		k=s.nextInt();
		int i=start;
		while(i<=end)
		{
			if(i==k)
			{
				break;
				
			}
			System.out.println(i);
			i=i+1;
		}
		

	}

}
