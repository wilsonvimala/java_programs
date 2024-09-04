package switchprogram;
import java.util.*;

public class memento 
{

	public static void main(String[] args) 
	{
		Scanner u=new Scanner(System.in);
		String city;
		System.out.println("enter city:");
		city=u.nextLine();
		switch(city)
		{
		case ("delhi"): 
		{
		System.out.println("red fort");
		break;
		}
		case ("agra"):
		{
		System.out.println("taj mahal");
		break;
		}
		case ("jaipur"):
			
		{
			System.out.println("jal mahal");
			break;
		}
		default:
		{
				System.out.println("error");
				break;
				
		}
		
		
		
		}
		

	}

}
