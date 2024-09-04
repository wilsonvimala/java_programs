package oops;
import java.util.*;
class Even1
{
	int x;
	void evenfn(int m)
	{
		x=m;
		if(m/2==0)
		{
			System.out.println("even number");
		}
		else
		{
			System.out.println("odd number");
		}
	}
}
public class Even {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("enter the first value");
		int a=s.nextInt();
		Even1 e=new Even1();
        e.evenfn(a);
	}

}
