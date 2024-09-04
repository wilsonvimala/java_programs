package oops;
import java.util.Scanner;
class Thisword2
{
	int idno;
	String Name;
	int mark;
	Thisword2(int idno,String Name)
	{
		this.idno=idno;
		this.Name=Name;
	}
	Thisword2(int idno,String Name,int mark)
	{
		this(idno,Name);
		this.mark=mark;
		
	}
	void display()
	{
		System.out.println("roll no is"+idno+" name is "+Name+" company is"+mark);
		
	}
		
	
	
}
public class Constructororoverload {

	public static void main(String[] args) 
	{
		Scanner s =new Scanner(System.in);
		System.out.print("enter the roll no");
		int a=s.nextInt();
		System.out.print("enter the name");
		String b=s.next();
		Thisword2 n1=new Thisword2(a,b);
		n1.display();
		System.out.print("enter the roll no");
		int q=s.nextInt();
		System.out.print("enter name");
		String w=s.next();
		System.out.print("enter the Mark");
		int e=s.nextInt();
		Thisword2 n2=new Thisword2(q,w,e);
		n2.display();
		

	}

}
