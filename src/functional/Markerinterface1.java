package functional;
interface Ticket
{
	
}
class Person implements Ticket
{
	
}
public class Markerinterface1 {

	public static void main(String[] args)
	{
		Person s=new Person();
		if(s instanceof Ticket)
		{
			System.out.println("this objet login successfully");
			
		}
		else
		{
			System.out.println("objet not login");
		}

	}

}
