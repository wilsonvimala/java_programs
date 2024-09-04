package oops;
import java.util.Scanner;
class Mod
{
	int p,q,r;
	public void func(int x,int y)
	{
		p=x;
		q=y;
		r=p*q;
		System.out.println("area of rectangle is"+r);
	}
}
public class Modulus {

	public static void main(String[] args) {
		
		Mod g1=new Mod g1(),g2=new Mod();
		Scanner s=new Scanner(System.in);
		System.out.print("enter the 1st value:");
		int a=s.nextInt();
		System.out.print("enter the 2nd value");
		int b=s.nextInt();
		g1.func(a, b);
		g2.func(100,200);
		

	}

}
