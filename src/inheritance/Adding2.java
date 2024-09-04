package inheritance;
import java.util.Scanner;
class Base3
{
	public int add(int x,int y)
	{
		int z;
		z=x+y;
		return z;
	}
}
public class Adding2 extends Base3
{

	public static void main(String[] args)
	{
		Adding2 m=new Adding2();
		Scanner s=new Scanner(System.in);
		System.out.print("enter the first value");
		int d=s.nextInt();
		System.out.print("enter the second value");
		int e=s.nextInt();
		int k=m.add(d, e);
		System.out.println("adding 2 value "+k);
		

	}

}
