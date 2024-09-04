package oops;
import java.util.Scanner;
class Thisword
{
	int idno;
	String Name;
	int mark;
	Thisword(int idno,String Name,int mark)
	{
		this.idno=idno;
		this.Name=Name;
		this.mark=mark;
	}
	void display()
	{
		System.out.print("roll no is"+idno+"name is"+Name+"company is"+mark);
	}
}
public class ThisKey {

	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		System.out.print("enter the roll no");
		int idno=s.nextInt();
		System.out.print("enter the name");
		String Name=s.next();
		System.out.println("enter the mark");
		int mark=s.nextInt();
		Thisword n=new Thisword(idno,Name,mark);
		n.display();

	}

}
