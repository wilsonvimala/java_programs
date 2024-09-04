package oops;
import java.util.Scanner;
class PConst
{
	int m=30,s=50,r;
	PConst(int x,int y)
{
	m=x;
	s=y;
	System.out.println("addition value is");
}
	public void add()
	{
		r=m+s;
		System.out.println(r);
	}
}
public class Constructor2 {

	public static void main(String[] args) 
	{
		Scanner s= new Scanner(System.in);
		System.out.print("enter the first value");
		int a=s.nextInt();
		System.out.print("enter the second value");
		int b=s.nextInt();
		PConst n=new PConst(a,b);
		n.add();
	}
	

	}


