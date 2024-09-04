package loop02;
import java.util.*;
public class divisible
{

	public static void main(String[] args)
	{
		int a;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the value");
		a=s.nextInt();
		while(a!=1000)
		{
			if(a%3==0)
			{
				System.out.print(a+"divisible by 3");
				
			}
			else
			{
				
				System.out.println(a+"not divisible by 3");
			}
			System.out.println("enter the value");
			a=s.nextInt();
		}

	}

}
