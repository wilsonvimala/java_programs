package inheritance;
import java.util.Scanner;
public class Derived9  extends Base9_1
{
	Derived9(int x,int y)
	{
		super(x,y);
	}
	

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.print("enter the first value");
		int a=s.nextInt();
		System.out.print("enter the second value");
		int b=s.nextInt();
		Derived9 d=new Derived9(a,b);
		d.add();
		d.sub();
		d.rect();
		d.square();
		
		

	}

}
