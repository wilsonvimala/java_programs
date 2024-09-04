package oops;
import java.util.*;
class Div
{
	void divfn(int m)
	{
		if(m/3==0)
		{
			System.out.println("divisible by 3");
		}
		else
		{
			System.out.println("not divisible by 3");
		}
	}
}
public class Divisible {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.print("enter the first value");
		int a=s.nextInt();
		Div d=new Div();
		d.divfn(a);

	}

}
