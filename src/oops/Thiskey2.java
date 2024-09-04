package oops;
import java.util.Scanner;
class Thisword1
{
	int idno;
	String Name;
	int mark;
	Thisword1(int idno,String Name,int mark)
	{
		this.idno=idno;
		this.Name=Name;
		this.mark=mark;
	}	
	void display()
	{
		System.out.println("roll no is"+idno+" name is"+" company is"+mark);
	}
	
}
public class Thiskey2 
{

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.print("enter the roll no");
		int a=s.nextInt();
		System.out.print("enter the name");
		String b=s.next();
		System.out.print("enter the mark");
		int c=s.nextInt();
		Thisword1 n=new Thisword1(a,b,c);
		n.display();

	}

}
