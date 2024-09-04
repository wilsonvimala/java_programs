package loop02;
import java.util.*;
public class printingvalue
{

	public static void main(String[] args) 
	{
		int a,x;
		Scanner s=new Scanner(System.in);
		System.out.print("enter the value");
		a=s.nextInt();
		while(a!=500) {
			x=a*a;
			System.out.println("the square value is"+x);
			System.out.print("enter the value");
			a=s.nextInt();
		}
	

	}

}
