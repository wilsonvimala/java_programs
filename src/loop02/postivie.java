package loop02;
import java.util.*;
public class postivie 
{

	public static void main(String[] args) 
	{
		int a,x=0,y=0;
		Scanner s=new Scanner(System.in);
		System.out.print("enter the value");
		a=s.nextInt();
		while(a!=1000)
		{
			if(a>0)
			{
				x=x+a;
				
			}
			else
			{
				y=y+a;
			}
			System.out.print("enter the value");
			a=s.nextInt();
			
		}
		System.out.println("positive"+x);
		System.out.println("negative"+y);
		

	}

}
