package loop02;
import java.util.*;
public class eveno
{

	public static void main(String[] args) 
	{
		int a;
		Scanner s=new Scanner(System.in);
		System.out.print("enter the value:");
		a=s.nextInt();
		while(a!=200)
		{
			System.out.println("the value is"+a);
			System.out.println("enter the value");
			a=s.nextInt();
		}

	}

}
