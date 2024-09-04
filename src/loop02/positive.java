package loop02;
import java.util.*;
public class positive 
{

	public static void main(String[] args)
	{
		int a;
		Scanner s=new Scanner(System.in);
		System.out.print("enter the value ");
		a=s.nextInt();
		while(a!=1000) {
			if(a>0)
			{
				System.out.println(a+"positive number");
				
			}
			else if(a<0)
			{
				System.out.println(a+"neg");
				
			}
			else
			{
				System.out.println(a+"zero");
			}
			System.out.print("enter the value ");
			a=s.nextInt();
		}

	}

}
