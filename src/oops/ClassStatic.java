package oops;
import java.util.Scanner;
class Stat
{
	int idno;
	String Name;
	static String Cname="Ibm";
	Stat(int x,String y)
	{
		idno=x;
		Name=y;
	}
	void display()
	{
		System.out.println("roll no is"+idno+"name"+"company is"+Cname);
	}
	
}
public class ClassStatic {

	public static void main(String[] args) 
	{
		
		{
			Scanner s=new Scanner(System.in);
			for(int k=0;k<2;k++)
			{
				System.out.print("enter the roll no");
				int a=s.nextInt();
				System.out.print("enter the name");
				String b=s.next();
				Stat n=new Stat(a,b);
				n.display();
			}
		}

	}

}
